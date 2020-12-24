package model;

public  class Cliente extends Pessoa {
    private String endereco;
    private int idade;
    private char sexo;

    public Cliente(){}
    
    public Cliente(String endereco, int idade, char sexo) {
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Cliente(String endereco, int idade, char sexo, String nome, int matricula) {
        super(nome, matricula);
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
        
	
}
