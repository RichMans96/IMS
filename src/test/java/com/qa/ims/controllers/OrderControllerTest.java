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

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private Utils utils;

	@Mock
	private OrderDAO orderDAO;

	@InjectMocks
	private OrderController controller;
	
	@Test
	public void testCreate() {
		final Long I_ID = 1L, C_ID = 1L;
		final Integer QTY = 3;
		final Order created = new Order(I_ID, C_ID, QTY);

		Mockito.when(utils.getLong()).thenReturn(I_ID, C_ID);
		Mockito.when(utils.getInteger()).thenReturn(QTY);
		Mockito.when(orderDAO.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getInteger();
		Mockito.verify(orderDAO, Mockito.times(1)).create(created);
	}
	
	@Test
	public void testReadAll() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L, 1L, 12));

		Mockito.when(orderDAO.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(orderDAO, Mockito.times(1)).readAll();
	}

}
