
package model;


public class CD extends Musica{
    private boolean arranhado;
    private boolean duplo;

    public CD(){}
    
    public CD(boolean arranhado, boolean duplo, String autor, String numFaixas) {
        super(autor, numFaixas);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public CD(boolean arranhado, boolean duplo, String autor, String numFaixas, String codigo, String titulo, String genero, boolean locado) {
        super(autor, numFaixas, codigo, titulo, genero, locado);
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public boolean isArranhado() {
        return arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    public boolean isDuplo() {
        return duplo;
    }

    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }
    
    
    
    
    
    @Override
    public double calcularDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
