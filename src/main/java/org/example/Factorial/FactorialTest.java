package org.example.Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() throws IllegalAccessException {
        assertEquals(1,Factorial.calculateFactorial(1));
        assertEquals(2,Factorial.calculateFactorial(2));
        assertEquals(6,Factorial.calculateFactorial(3));
        assertEquals(24,Factorial.calculateFactorial(4));
        assertEquals(120,Factorial.calculateFactorial(5));

    }

}
