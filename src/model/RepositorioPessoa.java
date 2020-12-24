
package model;

import java.util.HashMap;
public class RepositorioPessoa {
    private HashMap<Integer, Pessoa> pessoas = new HashMap<>();

    public RepositorioPessoa() {}

    public HashMap<Integer, Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(HashMap<Integer, Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addCliente(String end,int idade,char sexo,String nome,int matricula){
        Cliente c = new Cliente(end, idade, sexo, nome, matricula);
        pessoas.put(matricula,c);
    }
    public void addOperador(String nome, int matricula, String login, String senha){
        OperadorDeSistema op = new OperadorDeSistema(nome, matricula, login, senha);
        pessoas.put(matricula,op);
    }
    
}
