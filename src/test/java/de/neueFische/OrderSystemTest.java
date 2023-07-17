package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderSystemTest {


    @Test
    void addMenu(){
        //Given
        OrderSystem orderSystem1 = new OrderSystem();
        //When
        boolean actual = orderSystem1.addMenu(new Menu(1, "All Bacon", 7.99, "Bacon Burger",
                "Fries", "Hot Brownie" ));
        //Then
        assertTrue(actual);
    }

    @Test
    void getOrderById(){
        //Given
        OrderSystem orderSystem1 = new OrderSystem();
        Menu expected = new Menu(1, "All Bacon", 7.99, "Bacon Burger",
                "Fries", "Hot Brownie");
        orderSystem1.addMenu(expected);

        //When
        Menu actual = orderSystem1.getOrderById(1);
        //
        assertEquals(expected, actual);
    }

}