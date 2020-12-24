
package model;


public class VHS extends Filmes{
    private boolean cores;

    public VHS(){}
    
    public VHS(boolean cores, int anoLocamento, int duracao) {
        super(anoLocamento, duracao);
        this.cores = cores;
    }

    public VHS(boolean cores, int anoLocamento, int duracao, String codigo, String titulo, String genero, boolean locado) {
        super(anoLocamento, duracao, codigo, titulo, genero, locado);
        this.cores = cores;
    }

    public boolean isCores() {
        return cores;
    }

    public void setCores(boolean cores) {
        this.cores = cores;
    }
    
    
    
    @Override
    public double calcularDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
