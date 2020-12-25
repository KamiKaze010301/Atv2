
package model;


public abstract class Musica extends Produto{
    private String autor;
    private String numFaixas;

    public Musica(){}
    
    public Musica(String autor, String numFaixas) {
        this.autor = autor;
        this.numFaixas = numFaixas;
    }

    public Musica(String autor, String numFaixas, String codigo, String titulo, String genero, boolean locado) {
        super(codigo, titulo, genero, locado);
        this.autor = autor;
        this.numFaixas = numFaixas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(String numFaixas) {
        this.numFaixas = numFaixas;
    }
    
}
