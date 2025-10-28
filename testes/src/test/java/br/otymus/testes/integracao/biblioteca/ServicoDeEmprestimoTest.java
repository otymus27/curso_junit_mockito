package br.otymus.testes.integracao.biblioteca;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServicoDeEmprestimoTest {

    @Test
    @DisplayName("Test emprestar livro caso exista")
    void testEmprestarLivroCasoExiste() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        RepositorioDeLivros repositorio =  new RepositorioDeLivros();
        ServicoDeEmprestimo service = new ServicoDeEmprestimo(repositorio);
        Livro livro = new Livro("Xisto no espaço", "Serie Vagalume", "123");
        repositorio.adicionarLivro(livro);
        // When - Act : O que será feito ou o metodo que sera testado
        boolean emprestado = service.emprestarlivro("123");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertTrue(emprestado);
    }

    @Test
    @DisplayName("Test verificando se livro existe")
    void testNaoDeveEmprestarLivroInexistente() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        RepositorioDeLivros repositorio =  new RepositorioDeLivros();
        ServicoDeEmprestimo service = new ServicoDeEmprestimo(repositorio);

        // When - Act : O que será feito ou o metodo que sera testado
        boolean emprestado = service.emprestarlivro("999");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertFalse(emprestado);
    }
}
