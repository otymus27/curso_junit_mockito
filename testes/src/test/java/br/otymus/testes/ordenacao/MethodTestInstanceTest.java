package br.otymus.testes.ordenacao;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodTestInstanceTest {

    StringBuilder valorAtual = new StringBuilder("");

    @AfterEach
    public void afterEach() {
        System.out.println("O valor atual é : "+ valorAtual);
    }

    @Test
    @Order(1)
    @DisplayName("Test A")
    void testA() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testA");
        valorAtual.append("1");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }

    @Test
    @Order(2)
    @DisplayName("Test B")
    void testB() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testB");
        valorAtual.append("2");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }


    @Test
    @Order(3)
    @DisplayName("Test C")
    void testC() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado
        System.out.println("Running testC");
        valorAtual.append("3");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }
}
