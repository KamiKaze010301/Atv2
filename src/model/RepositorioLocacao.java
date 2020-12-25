
package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
public class RepositorioLocacao {
    private ArrayList<String> list = new ArrayList();
    private String cod_prod;
    private int mat_client;
    private Calendar data_saida;
    private Calendar data_entrega;

    public RepositorioLocacao(){}
    
    public RepositorioLocacao(String cod_prod, int mat_client, Calendar data_saida, Calendar data_entrega) {
        this.cod_prod = cod_prod;
        this.mat_client = mat_client;
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getMat_client() {
        return mat_client;
    }

    public void setMat_client(int mat_client) {
        this.mat_client = mat_client;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Calendar getData_saida() {
        return data_saida;
    }

    public void setData_saida(Calendar data_saida) {
        this.data_saida = data_saida;
    }

    public Calendar getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Calendar data_entrega) {
        this.data_entrega = data_entrega;
    }

    
    public int calculaMulta(Calendar atual,Calendar vencimento){
        if(atual.before(vencimento)) return 0;
        int cont = 0;
        boolean x= true;
        while(x){
          if(vencimento.after(atual)) x = false;
          vencimento.add(Calendar.DAY_OF_MONTH,1);
          cont++;
      }
        return cont;
    }
    
}
