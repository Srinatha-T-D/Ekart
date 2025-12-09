package com.reljicd.exception;

import com.reljicd.model.Product;

public class NotEnoughProductsInStockException extends Exception {

    private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductsInStockException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductsInStockException(Product product) {
        super("Not enough %s products in stock. Only %d left".formatted(product.getName(), product.getQuantity()));
    }

}
