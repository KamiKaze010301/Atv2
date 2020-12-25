
package model;


public class DVD extends Filmes{
    private boolean arranhado;
    
    public DVD(){}
    
    public DVD(boolean arranhado, int anoLocamento, int duracao) {
        super(anoLocamento, duracao);
        this.arranhado = arranhado;
    }

    public DVD(boolean arranhado, int anoLocamento, int duracao, String codigo, String titulo, String genero, boolean locado) {
        super(anoLocamento, duracao, codigo, titulo, genero, locado);
        this.arranhado = arranhado;
    }

    public boolean isArranhado() {
        return arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    
    
    @Override
    public double calcularDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
