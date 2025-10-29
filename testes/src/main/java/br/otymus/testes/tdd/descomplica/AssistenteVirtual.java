package br.otymus.testes.tdd.descomplica;

public class AssistenteVirtual {

    public String processarComando(String comando) {
       if (comando.startsWith("saudar")) {
           String nome = comando.substring(7);
           return "Olá, " + nome + "!";
       }
       return "Não entendi.";
    }
}
