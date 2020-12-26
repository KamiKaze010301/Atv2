
package model;
import java.util.ArrayList;
import java.util.Calendar;
public class RepositorioLocacao {
    private ArrayList<Locacao> list = new ArrayList<Locacao>();
    public RepositorioLocacao(){}
    public ArrayList<Locacao> getList() {
        return list;
    }

    public void setList(ArrayList<Locacao> list) {
        this.list = list;
    }
    public void addLocacao(String cod_prod, int mat_client, Calendar data_saida, Calendar data_entrega){
        Locacao loc = new Locacao(cod_prod, mat_client, data_saida, data_entrega);
        list.add(loc);
    }
    public void procuCli(int matricula){
        
        for (Locacao i : list) {
            if(i.getMat_client() == matricula) System.out.println("Matriula:"+i.getMat_client()+" "+"Código:"+i.getCod_prod());
	}
    }
    public void procuProd(String codigo){
        
        for (Locacao i : list) {
            if(i.getCod_prod().equals(codigo)) System.out.println("Matriula:"+i.getMat_client()+" "+"Código:"+i.getCod_prod());
	}
    }
    public int calcularValor(int matricula,String codigo){
        for (Locacao i : list) {
            if(i.getMat_client()==matricula){
                if(i.getCod_prod().equals(codigo)){
                    Locacao l = new Locacao(codigo, matricula, i.getData_saida(), i.getData_entrega());
                    Calendar c = Calendar.getInstance();
                    int valor;
                    valor = l.calculaMulta(c, i.getData_entrega());
                    return valor;
                }
            }
	}
        return 0;
    }
    public void excluirLoc(int matricula){
        for(int i=0;i<getList().size();i++){
            Locacao l = list.get(i);
            if(l.getMat_client() == matricula){
                list.remove(l);
                break;
            }
        }
    }
}
