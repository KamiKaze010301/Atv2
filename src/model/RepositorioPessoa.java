
package model;

import java.util.HashMap;
public class RepositorioPessoa {
    private HashMap<Integer, Cliente> cliente = new HashMap<>();
    private HashMap<Integer, OperadorDeSistema> operador = new HashMap<>();
    public RepositorioPessoa() {}

    public HashMap<Integer, Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(HashMap<Integer, Cliente> cliente) {
        this.cliente = cliente;
    }

    public HashMap<Integer, OperadorDeSistema> getOperador() {
        return operador;
    }

    public void setOperador(HashMap<Integer, OperadorDeSistema> operador) {
        this.operador = operador;
    }

    

    

    public void addCliente(String end,int idade,char sexo,String nome,int matricula){
        Cliente c = new Cliente(end, idade, sexo, nome, matricula);
        cliente.put(matricula,c);
    }
    public void addOperador(String nome, int matricula, String login, String senha){
        OperadorDeSistema op = new OperadorDeSistema(nome, matricula, login, senha);
        operador.put(matricula,op);
    }
    
}
