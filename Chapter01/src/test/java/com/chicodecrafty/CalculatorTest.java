package com.chicodecrafty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        //Arrange
        int a = 3;
        int b = 4;
        //Act
        int result = calculator.add(a, b);
        //Assert
        assertEquals(7, result);
    }

    @Test
    void subtract() {
        //Arrange
        int a = 5;
        int b = 3;
        //Act
        int result = calculator.subtract(a, b);
        //Assert
        assertEquals(2, result);
    }

    @Test
    void multiply() {
        //Arrange
        int a = 5;
        int b = 5;
        //Act
        int result = calculator.multiply(a, b);
        //Assert
        assertEquals(25, result);
    }

    @Test
    void divide_happy_path() {
        //Arrange
        int a = 5;
        int b = 5;
        //Act
        int result = calculator.divide(a, b);
        //Assert
        assertEquals(1, result);
    }

    @Test
    void divide_non_happy_path() {
        //Arrange
        int a = 5;
        int b = 0;
        //Act
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> calculator.divide(a, b));
        //Assert
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
