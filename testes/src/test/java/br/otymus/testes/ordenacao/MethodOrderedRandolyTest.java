package br.otymus.testes.ordenacao;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandolyTest {

    @Order(1)
    @Test
    @DisplayName("Test ordenação randomica de testes")
    void testA() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testA");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }

    @Test
    @DisplayName("Test ordenação randomica de testes")
    void testB() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testB");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }


    @Test
    @DisplayName("Test ordenação randomica de testes")
    void testC() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testC");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }
}
