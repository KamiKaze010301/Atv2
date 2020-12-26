
package model;
import java.util.HashMap;
public class RepositorioProduto {
    private HashMap<String, Produto> produto = new HashMap<>();

    public RepositorioProduto() {}

    public HashMap<String, Produto> getP() {
        return produto;
    }

    public void setP(HashMap<Integer, Produto> p) {
        this.produto = produto;
    }
    
    public void addProduto(String codigo,String titulo,String genero,boolean locado){
        Produto p = new Produto(codigo, titulo, genero, locado) {
            @Override
            public double calcularDiaria() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        produto.put(codigo,p);
    }
}
