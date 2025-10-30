package br.otymus.testes.mockito;

import java.util.ArrayList;
import java.util.List;

// SUT - System (Method) Under Test
public class CursoServico {

    // CursoInterface é uma depedencia
    private  CursoInterface cursoInterface;

    public CursoServico(CursoInterface curso) {
        this.cursoInterface = curso;
    }

    public List<String> recuperarCursosRelacionadosASpring(String aluno) {
        var cursosFiltrados = new ArrayList<String>();

        if("Teste".equals(aluno)){
            return cursosFiltrados;
        }

        var todosCursos = cursoInterface.recuperarCursos(aluno);

        for (String curso : todosCursos) {
            if (curso.contains("Spring")){
                cursosFiltrados.add(curso);
            }
        }

        return cursosFiltrados;
    }


    public void excluirCursosQueNaoContemSpring(String aluno) {
        var todosCursos = cursoInterface.recuperarCursos(aluno);

        for (String curso : todosCursos) {
            // Quando não conter 'spring' no nome do curso o metodo é chamado
            if (!curso.contains("Spring")){
                cursoInterface.excluirCurso(curso);
            }
        }
    }

}
