package br.otymus.testes.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAPPTest {

    CalculadoraAPP calc;

    // Aqui é definido algo que será executado antes de todos os testes
    @BeforeAll
    static void setup() {
        System.out.println("Before All rodando!");
    }

    // Aqui é definido algo que será executado no final de todos os testes
    @AfterAll
    static void cleanup() {
        System.out.println("After All rodando!");
    }

    @BeforeEach
    void BeforeEach() {
        calc = new CalculadoraAPP();
        System.out.println("BeforeEach rodando!");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("AfterEach rodando!");
    }

    @Test
    @DisplayName("Test soma 6.2 + 2.0 = 8.2")
    void testSomar() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        double a = 6.2;
        double b = 2.0;

        // When - Act : O que será feito ou o metodo que sera testado
        Double resultado = calc.somar(a,b);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(8.2,resultado);
        assertNotEquals(9,resultado);
        assertNotNull(resultado);
    }

    @Test
    @DisplayName("Test subtrair 6.2 - 2.0 = 4.2")
    void testSubtrair() {
        // Arrange

        // Act
        Double resultado = calc.subtrair(6.0,2.0);

        // Assertion
        assertEquals(4.0,resultado);
    }

    @Test
    @DisplayName("Test soma 6.0 * 2.0 = 12.0")
    void testMultiplicar() {
        // Arrange

        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calc.multiplicar(a,b);

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

        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calc.dividir(a,b);

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


        // Act
        double a = 6.0;
        double b = 2.0;
        Double resultado = calc.calcularMedia(a,b);

        // Assertion com messagem
        double expected = 4.0;
        assertEquals(expected,resultado,
                () -> "A média entre "+a + " + " + b +
                        "O teste não produziu "+expected+ " como era esperado");
    }

    @Test
    @DisplayName("Test raiz quadrada de 36.0 = 6.0")
    void calcularRaizTest() {

        System.out.println("Calculando Raiz quadrada de 36.0");

        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        double a = 36.0;
        double expected = 6.0;

        // When - Act : O que será feito ou o metodo que sera testado
        Double resultado = calc.calcularRaiz(a);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(expected,resultado,
                () -> "A raiz quadrada de "+a +
                        "O teste não produziu "+expected+ " como era esperado");
    }

    //@Disabled
    @Test
    @DisplayName("Test divisão de numero por zero")
    void testDividirPorZero() {
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

    @Test
    @DisplayName("Test alguma coisa")
    void testNome() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste

        // When - Act : O que será feito ou o metodo que sera testado


        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado

    }
}