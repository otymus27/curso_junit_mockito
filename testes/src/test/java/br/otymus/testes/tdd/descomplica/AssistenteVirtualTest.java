package br.otymus.testes.tdd.descomplica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssistenteVirtualTest {

    @Test
    @DisplayName("DeveSaudarPessoaComNome")
    void testDeveSaudarPessoaComNome() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        AssistenteVirtual assistente = new AssistenteVirtual();

        // When - Act : O que será feito ou o metodo que sera testado
        String resposta = assistente.processarComando("saudar João");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals("Olá, João!", resposta);

    }


//    @Test
//    @DisplayName("Test 1")
//    void testDeveCriarTimerQuandoNomeETempoForemInformados() {
//        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
//        AssistenteVirtual assistente = new AssistenteVirtual();
//
//        // When - Act : O que será feito ou o metodo que sera testado
//        String resposta = assistente.processarComando("Criar timer cha para 5 minutos");
//
//        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
//        assertEquals("Timer 'cha' criado para 5 minutos", resposta);
//
//    }
//
//    @Test
//    @DisplayName("Test 2")
//    void testDevePedirNomeQuandoSoTempoForInformado() {
//        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
//        AssistenteVirtual assistente = new AssistenteVirtual();
//
//        // When - Act : O que será feito ou o metodo que sera testado
//        String resposta = assistente.processarComando("Criar timer 10 minutos");
//
//        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
//        assertEquals("Qual é o nome do timer?", resposta);
//
//    }
//
//    @Test
//    @DisplayName("Test 3")
//    void testDevePedirTempoQuandoNomeForInformado() {
//        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
//        AssistenteVirtual assistente = new AssistenteVirtual();
//
//        // When - Act : O que será feito ou o metodo que sera testado
//        String resposta = assistente.processarComando("Criar timer chamado forno");
//
//        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
//        assertEquals("Qual é a duração do timer?", resposta);
//
//    }
//
//    @Test
//    @DisplayName("Test 4")
//    void testDeveLidarComTextoInesperado() {
//        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
//        AssistenteVirtual assistente = new AssistenteVirtual();
//
//        // When - Act : O que será feito ou o metodo que sera testado
//        String resposta = assistente.processarComando("Nada a ver qualquer coisa");
//
//        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
//        assertEquals("Desculpe, não entendi o comando", resposta);
//
//    }
}
