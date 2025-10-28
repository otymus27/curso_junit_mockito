package br.otymus.testes.integracao.Pessoa;

import java.util.List;

public interface RepositorioDePessoas {
    void salvar(Pessoa pessoa);
    Pessoa buscarPorId(int id);
    List<Pessoa> listarTodas();
    void removerTodas();
    List<Pessoa> buscarPorNome(String nome);
}
