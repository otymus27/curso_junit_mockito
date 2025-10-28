package br.otymus.testes.integracao.biblioteca;

public class ServicoDeEmprestimo {
    private RepositorioDeLivros repositorio;

    public ServicoDeEmprestimo(RepositorioDeLivros repositorio) {
        this.repositorio = repositorio;
    }

    public boolean emprestarlivro(String isbn) {
        if(repositorio.livroDisponivel(isbn)){
            System.out.println("Livro emprestado com sucesso:  " + isbn);
            return true;
        }else {
            System.out.println("Livro não encontrado: " + isbn);
            return false;
        }
    }
}
