package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {
	
	@Mock
	private Utils utils;

	@Mock
	private ItemDAO dao;
	
	@InjectMocks
	private ItemController controller;
	
	@Test
	public void testCreate() {
		final String I_NAME = "Pen";
		final Double I_PRICE = 2.2;
		final Item created = new Item(I_NAME, I_PRICE);

		Mockito.when(utils.getString()).thenReturn(I_NAME);
		Mockito.when(utils.getDouble()).thenReturn(I_PRICE);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
	
	@Test
	public void testReadAll() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(2L, "Pizza", 9.99));

		Mockito.when(dao.readAll()).thenReturn(items);

		assertEquals(items, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	@Test
	public void testUpdate() {
		Item updatedItem = new Item(1L, "TV", 100.20);

		Mockito.when(this.utils.getLong()).thenReturn(updatedItem.getItemId());
		Mockito.when(this.utils.getString()).thenReturn(updatedItem.getItemName());
		Mockito.when(this.utils.getDouble()).thenReturn(updatedItem.getItemPrice());
		Mockito.when(this.dao.update(updatedItem)).thenReturn(updatedItem);

		assertEquals(updatedItem, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updatedItem);
	}
	
	@Test
	public void testDelete() {
		final long itemId = 1L;

		Mockito.when(utils.getLong()).thenReturn(itemId);
		Mockito.when(dao.delete(itemId)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(itemId);
	}
}
