
package model;


public abstract class Filmes extends Produto{
    private int anoLocamento;
    private int duracao; // Duração em Minutos
    
    public Filmes(){}
    
    public Filmes(int anoLocamento, int duracao) {
        this.anoLocamento = anoLocamento;
        this.duracao = duracao;
    }

    public Filmes(int anoLocamento, int duracao, String codigo, String titulo, String genero, boolean locado) {
        super(codigo, titulo, genero, locado);
        this.anoLocamento = anoLocamento;
        this.duracao = duracao;
    }

    public int getAnoLocamento() {
        return anoLocamento;
    }

    public void setAnoLocamento(int anoLocamento) {
        this.anoLocamento = anoLocamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
