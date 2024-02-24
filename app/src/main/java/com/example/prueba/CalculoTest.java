package com.example.prueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculoTest {

    @Test
    public void testSum() {
        // Arrange
        int a = 5;
        int b = 10;
        int expectedResult = 15;

        // Act
        Calculo calculo = new Calculo();
        int result = calculo.sum(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }
}
