package br.otymus.testes.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

public class CursoServiceMockTest {
    CursoInterface mockService;
    CursoServico cursoServico;
    List<String> cursos;

    @BeforeEach
    void setup(){
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        mockService = mock(CursoInterface.class);
        cursoServico = new CursoServico(mockService);
        cursos = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
        );
    }


    @Test
    @DisplayName("Test com mocks")
    void testCursosRelacionadosComSpringUsandoMock() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        when(mockService.recuperarCursos("Leandro")).thenReturn(cursos);

        // When - Act : O que será feito ou o metodo que sera testado
        var cursosFiltrado = cursoServico.recuperarCursosRelacionadosASpring("Leandro");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(4, cursosFiltrado.size());

    }

    @Test
    @DisplayName("Test mockando tamanho de uma lista com 10 elementos")
    void testMockandoTamanhoDeUmaListaRetorna10() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        List<?> lista = mock(List.class);

        // When - Act : O que será feito ou o metodo que sera testado
        when(lista.size()).thenReturn(10);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(10, lista.size());

    }

    @Test
    @DisplayName("Test mockando tamanho de uma lista com multiplos valores")
    void testMockandoTamanhoDeUmaListaRetornaMultiplosValores() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        List<?> lista = mock(List.class);

        // When - Act : O que será feito ou o metodo que sera testado
        when(lista.size()).thenReturn(10).thenReturn(20);

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals(10, lista.size());
        assertEquals(20, lista.size());
        assertEquals(20, lista.size());

    }

    @Test
    @DisplayName("Test mockando lista com get")
    void testMockandoListaComGet() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        var lista = mock(List.class);

        // When - Act : O que será feito ou o metodo que sera testado
        when(lista.get(0)).thenReturn("Teste");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals("Teste", lista.get(0));
        assertNull(lista.get(1));

    }

    @Test
    @DisplayName("Test mockando lista com get")
    void testMockandoListaComGetChamandoComparadorDeArqumentos() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        var lista = mock(List.class);

        // When - Act : O que será feito ou o metodo que sera testado
        when(lista.get(anyInt())).thenReturn("Teste");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        assertEquals("Teste", lista.get(anyInt()));
        assertEquals("Teste", lista.get(1));

    }

    @Test
    @DisplayName("Test mockando lista com get")
    void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnTeste() {
        // 🧩 Given (Arrange)
        // Nesta etapa preparamos os dados e objetos necessários para o teste.
        // Aqui estamos criando um mock (objeto simulado) da interface List.
        // Esse mock não é uma lista real, é um objeto controlado pelo Mockito.
        var lista = mock(List.class);

        // ⚙️ When (Act)
        // Aqui definimos o comportamento esperado do mock.
        // Dizemos: "Quando o metodo get() for chamado com QUALQUER inteiro (anyInt()),
        // retorne a string 'Teste'".
        // Isso é chamado de *stubbing* (definição de comportamento simulado).
        when(lista.get(anyInt())).thenReturn("Teste");

        // ✅ Then (Assert)
        // Agora verificamos se o comportamento do mock está conforme o esperado.
        // Ou seja, se qualquer chamada a lista.get(...) retorna "Teste".
        // O metodo assertEquals compara o valor esperado ("Teste")
        // com o valor retornado pela chamada do metodo.
        assertEquals("Teste", lista.get(anyInt()));
        assertEquals("Teste", lista.get(1));
    }

    @Test
    @DisplayName("Deve simular (mockar) uma exceção ao chamar o método get() de uma lista")
    void testMockingList_When_ThrowAnException() {

        // 🧩 GIVEN (Arrange)
        // Cria um mock da interface List usando o Mockito.
        // Isso significa que 'lista' não é uma lista real, e sim um objeto simulado,
        // cujo comportamento nós controlamos.
        var lista = mock(List.class);

        // ⚙️ WHEN (Act)
        // Definimos o comportamento (stubbing):
        // sempre que o metodo get() for chamado com qualquer número inteiro (anyInt()),
        // o mock deve lançar uma RuntimeException com a mensagem definida.
        when(lista.get(anyInt())).thenThrow(new RuntimeException("Foi lançado uma exceção!"));

        // ✅ THEN (Assert)
        // O metodo assertThrows() verifica se a exceção esperada realmente foi lançada.
        // 1º parâmetro → tipo da exceção esperada
        // 2º parâmetro → trecho de código que deve lançar a exceção
        // 3º parâmetro → mensagem de erro caso a exceção não ocorra
        assertThrows(RuntimeException.class,
                () -> {lista.get(anyInt());},
                () -> "Should have throw an RuntimeException!");

    }

    @Test
    @DisplayName("Deve simular (mockar) a exclusão de um curso que não contenha a palavra spring.")
    void testExcluirCursoQueNaoContenhaPalavraComSpring() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        when(mockService.recuperarCursos("Leandro")).thenReturn(cursos);
        // When - Act : O que será feito ou o metodo que sera testado
        cursoServico.excluirCursosQueNaoContemSpring("Leandro");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        verify(mockService,times(1)).excluirCurso("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        verify(mockService).excluirCurso("REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker");
        verify(mockService,never()).excluirCurso("Microsserviços do 0 com Spring Cloud, Spring Boot e Docker");
    }

    @Test
    @DisplayName("Deve simular (mockar) a exclusão de um curso capturando argumentos.")
    void testExcluirCursoQueCapturandoArgumentos() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        cursos = Arrays.asList(
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker"

        );


        when(mockService.recuperarCursos("Leandro")).thenReturn(cursos);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        String agileCurso = "Agile Desmistificado com Scrum, XP, Kanban e Trello";

        // When - Act : O que será feito ou o metodo que sera testado
        cursoServico.excluirCursosQueNaoContemSpring("Leandro");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        then(mockService).should().excluirCurso(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue(), is(agileCurso));
    }

    @Test
    @DisplayName("Deve simular (mockar) a exclusão de um curso capturando varios argumentos.")
    void testExcluirCursoQueCapturandoVariosArgumentos() {
        // Given - Arrange : Seção onde preparamos ou definimos as variaveis que serao usadas no teste
        when(mockService.recuperarCursos("Leandro")).thenReturn(cursos);

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        //String agileCurso = "Agile Desmistificado com Scrum, XP, Kanban e Trello";

        // When - Act : O que será feito ou o metodo que sera testado
        cursoServico.excluirCursosQueNaoContemSpring("Leandro");

        // Then - Assertion : Verificação se o retorno foi de acordo com o esperado
        then(mockService).should(times(7)).excluirCurso(argumentCaptor.capture());
        assertThat(argumentCaptor.getAllValues().size(), is(7));
    }
}
