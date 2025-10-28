package br.otymus.testes.ordenacao;

import org.junit.jupiter.api.*;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    @Test
    @Order(3)
    @DisplayName("Test A")
    void testA() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testA");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }

    @Test
    @Order(1)
    @DisplayName("Test B")
    void testB() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testB");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }


    @Test
    @Order(2)
    @DisplayName("Test C")
    void testC() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testC");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }
}
