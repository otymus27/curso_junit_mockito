package br.otymus.testes.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    @DisplayName("Test comparação de arrays ")
    void testArraysCompare() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        int[] numbers = {25, 8, 21,32,3};
        int[] expectedArray = {3,8,21,25,32};

        // When - Act : O que será feito ou o metodo que sera testado
        Arrays.sort(numbers);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertArrayEquals(numbers,expectedArray);
    }


    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Test performace de arrays ")
    void testSortPerformace() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        int[] numbers = {25, 8, 21,32,3};
        for (int i = 0; i < 10000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }

        // When - Act : O que será feito ou o metodo que sera testado


        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }
}
