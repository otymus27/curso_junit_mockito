package br.otymus.testes.mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoServiceStubTest {

    @Test
    @DisplayName("Test com mocks")
    void testCursosRelacionadosComSpringUsandoStub() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        CursoInterface stubService = new CursoServiceStub();
        CursoServico cursoServico = new CursoServico(stubService);

        // When - Act : O que será feito ou o metodo que sera testado
        var cursosFiltrado = cursoServico.recuperarCursosRelacionadosASpring("Leandro");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(4, cursosFiltrado.size());

    }

    @Test
    @DisplayName("Test passando parametros")
    void testCursosRelacionadosComSpringPassandoOutroParametro() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        CursoInterface stubService = new CursoServiceStub();
        CursoServico cursoServico = new CursoServico(stubService);

        // When - Act : O que será feito ou o metodo que sera testado
        var cursosFiltrado = cursoServico.recuperarCursosRelacionadosASpring("Teste");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(0, cursosFiltrado.size());

    }


}
