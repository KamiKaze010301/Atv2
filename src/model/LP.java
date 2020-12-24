
package model;


public class LP extends Musica{
    private boolean raro;

    public LP(){}
    
    public LP(boolean raro) {
        this.raro = raro;
    }

    public LP(boolean raro, String autor, String numFaixas) {
        super(autor, numFaixas);
        this.raro = raro;
    }

    public LP(boolean raro, String autor, String numFaixas, String codigo, String titulo, String genero, boolean locado) {
        super(autor, numFaixas, codigo, titulo, genero, locado);
        this.raro = raro;
    }

    public boolean isRaro() {
        return raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }
    
    
    
    
    @Override
    public double calcularDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
