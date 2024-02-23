package com.example.prueba;

import junit.framework.TestCase;

public class MainActivity2Test extends TestCase {
    public void testValorTotal() {
        double valorInicial = 100.0; // Valor inicial para el test
        double resultadoEsperado = 119.0; // El resultado esperado después de aplicar el impuesto del 19%

        // Llama al método que quieres probar
        double resultadoReal = MainActivity2.valorTotal(valorInicial);

        // Comprueba si el resultado real es igual al resultado esperado
        assertEquals(resultadoEsperado, resultadoReal);
    }
}