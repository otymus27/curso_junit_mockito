package br.otymus.testes.tdd.descomplica.pedidos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDePedidosTest {

    @Test
    @DisplayName("Test calculadora de pedidos")
    void testDeveCalcularTotalComBaseNosValoresRegistrados() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        CalculadoraDePedidos calc = new CalculadoraDePedidos();

        // When - Act : O que será feito ou o metodo que sera testado
        double resultado = calc.registrar(5.0,7.5);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(12.5, resultado);
    }
}
