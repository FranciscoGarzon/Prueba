package com.example.prueba;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

        public void testSum() {
            int a = 300 * 4;
            int b = 100 * 3;
            int expected = 1500;
            int result = MainActivity.sum(a, b);
            assertEquals(expected, result);
        }
}