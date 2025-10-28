package br.otymus.testes.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAPPTest {

    @Test
    @DisplayName("Test soma 6.2 + 2.0 = 8.2")
    void testSomar() {
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
    @DisplayName("Test subtrair 6.2 - 2.0 = 4.2")
    void testSubtrair() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        Double resultado = calculadoraAPP.subtrair(6.0,2.0);

        // Assertion
        assertEquals(4.0,resultado);
    }

    @Test
    @DisplayName("Test soma 6.0 * 2.0 = 12.0")
    void testMultiplicar() {
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
    @DisplayName("Test soma 6.0 + 2.0 = 3.0")
    void testDividir() {
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
    @DisplayName("Test media 6.0 + 2.0 = 4.0")
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
    @DisplayName("Test raiz quadrada de 36.0 = 6.0")
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

    @Test
    @DisplayName("Test divisão de numero por zero")
    void testDividirPorZero() {
        // Arrange
        CalculadoraAPP calculadoraAPP = new CalculadoraAPP();

        // Act
        double a = 6.0;
        double b = 0;
        Double resultado = calculadoraAPP.dividir(a,b);

        // Execução do caso de teste
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculadoraAPP.dividir(a,b);
        });

        // Verificação do caso de teste
        assertEquals("Divisão por zero não permitida", exception.getMessage());

       
    }


}