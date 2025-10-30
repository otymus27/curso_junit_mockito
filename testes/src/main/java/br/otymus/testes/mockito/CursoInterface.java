package br.otymus.testes.mockito;

import java.util.List;

public interface CursoInterface {
    public List<String> recuperarCursos(String aluno);

    public List<String> recuperarAlunos(String aluno);

    public void excluirCurso(String curso);
}
