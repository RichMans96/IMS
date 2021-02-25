package com.qa.ims.persistence.dao;


import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;


public class ItemDAOTest {
	
	private final ItemDAO itemDAO = new ItemDAO();
	
    
    public static void clearItemsTable() {
       try (Connection connection = DBUtils.getInstance().getConnection();
               Statement statement = connection.createStatement();) {
    	   statement.executeUpdate("delete from items");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
		ItemDAOTest.clearItemsTable();
	}
	
	
	@Test
	public void testCreate() {
		final Item created = new Item(2L, "Paper", 1.2);
		assertEquals(created, itemDAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "Pen", 0.2));
		assertEquals(expected, itemDAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Item(1L, "Pen", 0.2), itemDAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final Long itemId = 1L;
		assertEquals(new Item(itemId, "Pen", 0.2), itemDAO.read(itemId));
	}
	
	@Test
	public void testUpdate() {
		final Item updatedItem = new Item(1L, "TV", 100.20);
		assertEquals(updatedItem, itemDAO.update(updatedItem));

	}
	
	@Test
	public void testDelete() {
			assertEquals(1, itemDAO.delete(1));
	}
	
	

}
