package br.otymus.testes.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAPPTest {

    @Test
    void testaSomar() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 6.2;
        double b = 2.0;
        Double resultado = calculadoraAPP.somar(a,b);

        // Assertion
        assertEquals(8.2,resultado);
        assertNotEquals(9,resultado);
        assertNotNull(resultado);
    }

    @Test
    void subtrair() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        Double resultado = calculadoraAPP.subtrair(6.0,2.0);

        // Assertion
        assertEquals(4.0,resultado);
    }

    @Test
    void multiplicar() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calculadoraAPP.multiplicar(a,b);

        // Assertion com messagem
        double expected = 12.0;
        assertEquals(expected,resultado,
                () -> a + " * " + b +
                "O teste não produziu "+expected+ " como era esperado");
    }

    @Test
    void dividir() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calculadoraAPP.dividir(a,b);

        // Assertion com messagem
        double expected = 3.0;
        assertEquals(expected,resultado,
                () -> a + " / " + b +
                        "O teste não produziu "+expected+ " como era esperado");
    }
    @Test
    void calcularMedia() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calculadoraAPP.calcularMedia(a,b);

        // Assertion com messagem
        double expected = 4.0;
        assertEquals(expected,resultado,
                () -> "A média entre "+a + " + " + b +
                        "O teste não produziu "+expected+ " como era esperado");
    }

    @Test
    void calcularRaizTest() {

        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 36.0;
        Double resultado = calculadoraAPP.calcularRaiz(a);

        // Assertion
        double expected = 6.0;
        assertEquals(expected,resultado,
                () -> "A raiz quadrada de "+a +
                        "O teste não produziu "+expected+ " como era esperado");
    }
}