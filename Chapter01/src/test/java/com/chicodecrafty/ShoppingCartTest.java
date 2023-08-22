package com.chicodecrafty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    private final ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    void addItem() {
        //Arrange
        shoppingCart.addItem("Bag");
        shoppingCart.addItem("Shoes");
        //Act
        int result = shoppingCart.getItemCount();
        //Assert
        assertEquals(2, result);
    }

    @Test
    void removeItems() {
        //Arrange
        shoppingCart.addItem("Watch");
        shoppingCart.addItem("Pencil");

        shoppingCart.removeItem("Pencil");
        //Act
        int result = shoppingCart.getItemCount();
        //Assert
        assertEquals(1, result);
    }
}
