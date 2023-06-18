package com.example.demo.controller;

import com.example.demo.model.persistence.Item;

import java.math.BigDecimal;

public class TestUtils {
    public static final String ROUND_WIDGET = "Round Widget";

    public static Item getItem0() {
        Item item = new Item();
        item.setId(0L);
        item.setName(ROUND_WIDGET);
        item.setPrice(new BigDecimal("2.99"));
        item.setDescription("A widget that is round");
        return item;
    }

    public static Item getItem1() {
        Item item = new Item();
        item.setId(1L);
        item.setName("Square Widget");
        item.setPrice(new BigDecimal("1.99"));
        item.setDescription("A widget that is square");
        return item;
    }
}
