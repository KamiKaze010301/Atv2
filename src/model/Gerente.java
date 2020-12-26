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
        for (Cliente i : g.getRep().getCliente().values()) {
            System.out.println("Matrícula:"+i.getMatricula()+" "+"Nome:"+i.getNome()+"Endereço:"+i.getEndereco()+" "+"Idade:"+i.getIdade()+" "+"Sexo:"+i.getSexo());          
        }
    }
    public void listarOperador(RepositorioPessoa rep,Gerente g){
        OperadorDeSistema o = new OperadorDeSistema();
        for (OperadorDeSistema i : g.getRep().getOperador().values()) {
            System.out.println("Matrícula:"+i.getMatricula()+" "+"Nome:"+i.getNome()+"Longin:"+i.getLogin()+" "+"Senha:"+i.getSenha());
        }
    }
    public void procurarProduto(RepositorioProduto prd,Gerente g,String codigo){
        for (Produto i : g.getPrd().getP().values()) {
            if(i.getCodigo().equals(codigo)){
                System.out.println("Código:"+i.getCodigo()+" "+"Título:"+i.getTitulo());
            }
        }
    }
    public void procurarCliente(RepositorioProduto prd,Gerente g, int mat){
        Cliente c = new Cliente();
        for (Cliente i : g.getRep().getCliente().values()) {           
                if (i.getMatricula()==mat) {
                    System.out.println("Matrícula:"+i.getMatricula()+" "+"Nome:"+i.getNome()+"Endereço:"+i.getEndereco()+" "+"Idade:"+i.getIdade()+" "+"Sexo:"+i.getSexo());
            }
        }
    }
    public void procurarOperador(RepositorioProduto prd,Gerente g, int mat){
        OperadorDeSistema o = new OperadorDeSistema();
        for (OperadorDeSistema i : g.getRep().getOperador().values()) {
            if(i.getMatricula()==mat){
            System.out.println("Matrícula:"+i.getMatricula()+" "+"Nome:"+i.getNome()+"Longin:"+i.getLogin()+" "+"Senha:"+i.getSenha());
            }
        }
    }
}
