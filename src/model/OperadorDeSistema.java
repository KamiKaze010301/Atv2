package model;

import java.util.Calendar;

public class OperadorDeSistema extends Funcionario {
    private RepositorioLocacao loc;

    public RepositorioLocacao getLoc() {
        return loc;
    }

    public void setLoc(RepositorioLocacao loc) {
        this.loc = loc;
    }
    
    public OperadorDeSistema(RepositorioLocacao loc){
     this.loc = loc;
    }
    public OperadorDeSistema(){}
    
    public OperadorDeSistema(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }
    public void adicionarLocacao(String cod_prod, int mat_client, Calendar data_saida, Calendar data_entrega){
        getLoc().addLocacao(cod_prod, mat_client, data_saida, data_entrega);
    }
    public int darBaixa(int matricula,String codigo){
        int valor = getLoc().calcularValor(matricula, codigo);
        getLoc().excluirLoc(matricula);
        return valor;
    }
    public void procurarCli(int matricula){
        getLoc().procuCli(matricula);
    }
    public void procurarProd(String codigo){
        getLoc().procuProd(codigo);
    }
    public void excluirLocacao(int matricula){
        getLoc().excluirLoc(matricula);
    }
}
