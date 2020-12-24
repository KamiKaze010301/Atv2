package model;
public class Gerente extends Funcionario {

    
    private RepositorioPessoa rep;
    private RepositorioProduto prd;
    
    public Gerente(RepositorioPessoa rep) {
        this.rep = rep;
    }
    
    public Gerente(RepositorioProduto prd){
        this.prd = prd;
    }
    
    
    public RepositorioProduto getPrd() {
        return prd;
    }

    public void setPrd(RepositorioProduto prd) {
        this.prd = prd;
    }
    
    public RepositorioPessoa getRep() {
        return rep;
    }

    public void setRep(RepositorioPessoa rep) {
        this.rep = rep;
    }
    
    public Gerente(){}

    public Gerente(RepositorioPessoa rep, RepositorioProduto prd, String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
        this.rep = rep;
        this.prd = prd;
    }

    
    
    public void adicionarCliente(String end,int idade,char sexo,String nome,int matricula){
        getRep().addCliente(end, idade, sexo, nome, matricula);
    }
    public void adicionarOperador(String nome, int matricula, String login, String senha){
        getRep().addOperador(nome, matricula, login, senha);
    }
    public void adicionarProdutoQualquer(String codigo,String titulo,String genero,boolean locado){
        getPrd().addProduto(codigo, titulo, genero, locado);
    }
    public void listarClientes(RepositorioPessoa rep,Gerente g){
        Cliente c = new Cliente();
        for (Pessoa i : g.getRep().getPessoas().values()) {
            if(i.getClass().equals(c.getClass())){
            System.out.println(i.getNome());
            }
        }
    }
    public void listarOperador(RepositorioPessoa rep){
        OperadorDeSistema o = new OperadorDeSistema();
        Gerente g = new Gerente(rep);
        for (Pessoa i : g.getRep().getPessoas().values()) {
            if(i.getClass().equals(o.getClass())){
            System.out.println(i.getNome());
            }
        }
    }
}
