package com.qa.ims.persistence.dao;


import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;


public class ItemDAOTest {
	
	private final ItemDAO itemDAO = new ItemDAO();
	
	@BeforeEach
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
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
	

}
