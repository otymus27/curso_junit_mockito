package br.otymus.testes.integracao.Pessoa;

import java.sql.*;

public abstract class RepositorioDePessoasJdbc implements RepositorioDePessoas {
    private final Connection conexao;
    public RepositorioDePessoasJdbc(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void salvar(Pessoa pessoa) {
        String sql = "INSERT INTO pessoas (nome, email) VALUES (?,?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());

            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                pessoa.setId(rs.getInt(1));
            }
        }catch (SQLException e){
            throw new RuntimeException("Erro ao salvar Pessoa: " + e.getMessage());
        }
    }
}
