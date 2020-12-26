
package model;


public class BluRays extends Filmes{
    private String[] idiomas = new String[2];

    public BluRays() {}

    public BluRays(int anoLocamento, int duracao) {
        super(anoLocamento, duracao);
    }

    public BluRays(int anoLocamento, int duracao, String codigo, String titulo, String genero, boolean locado) {
        super(anoLocamento, duracao, codigo, titulo, genero, locado);
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    
    
    
    
    
    @Override
    public double calcularDiaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
