package br.otymus.testes.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    CalculadoraAPP calc;

    @BeforeEach
    void BeforeEach() {
        calc = new CalculadoraAPP();
        System.out.println("BeforeEach rodando!");
    }

    //@Disabled
    @RepeatedTest(3)
    @DisplayName("Test divisão de numero por zero")
    void testDividirPorZero(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Repetition Nº "+repetitionInfo.getCurrentRepetition() + " de " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        double a = 6.0D;
        double b = 0D;

        var expected = "Divisão por zero não é permitida";
        // When - Act : O que será feito ou o metodo que sera testado
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(a,b);
        });

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(expected, exception.getMessage(), () ->"Erro inesperado, unexpected exception message!");


    }
}
