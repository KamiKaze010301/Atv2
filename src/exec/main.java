
package exec;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import model.Cliente;
import model.DVD;
import model.Pessoa;
import model.Gerente;
import model.OperadorDeSistema;
import model.Produto;
import model.RepositorioPessoa;
import model.RepositorioProduto;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import model.RepositorioLocacao;
public class main {
    public static void main(String[] args) throws IOException {
        RepositorioLocacao loc = new RepositorioLocacao();
        RepositorioPessoa rep = new RepositorioPessoa();
        RepositorioProduto prd = new RepositorioProduto();
        Gerente g = new Gerente(rep, prd, "Gerente 0", 1, "admin", "admin");
        telaInicial(rep,prd,g,loc);
	}
       
//			TELA INICIAL
	static void telaInicial(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc) throws IOException{
		Scanner scan = new Scanner(System.in);
		int escolha;
		

		System.out.println("****Bem-vindo, escolha um perfil abaixo:****");
		System.out.println("1 - Gerente");
		System.out.println("2 - Operador de Sistema");
		System.out.println("3 - Sair");
		escolha = scan.nextInt();
		
		switch (escolha){
		case 1:
			loginGerente(rep,prd,g,loc);
			break;
		case 2:
			loginOPS(rep,prd,g,loc);
			break;
		case 3:
			saidaFinal();
			break;
		default:
			
		}		
		
	}
	
//		LOGIN DE GERENTE
	static void loginGerente(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc) throws IOException {

        int escolha;
        String login;
        String senha;
        Scanner scan = new Scanner(System.in);

        escolha = 0;
        System.out.println("Faça seu Login");
        System.out.print("Digite seu login:    ");
        login = scan.next();
        if(g.getLogin().equals(login)) {

            System.out.println(); 
            System.out.print("Digite sua senha:    ");
            senha = scan.next();
            if(g.getSenha().equals(senha)) {
                menuGerente(rep,prd,g,loc);
            }
            else {
                System.out.println("Erro ao realizar login de gerente, veirifique sua senha!");
                loginGerente(rep,prd,g,loc);
            }
        }
        else {
            System.out.println("Erro ao realizar login de gerente, veirifique seu login!");
            loginGerente(rep,prd,g,loc);
        }
    }
	
// LOGIN DO OPERADOR DE SISTEMA
	static void loginOPS(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc) throws IOException {
		int escolha;
		String login;
		String senha;
		Scanner scan = new Scanner(System.in);
		escolha = 0;
		int matOps = 0;
		
		System.out.println("****Faça seu Login****");
		System.out.print("Digite seu login:	");
		login = scan.next();
		for(int i = 1; i <= g.getRep().getOperador().size(); i++ ) {
			if(g.getRep().getOperador().get(i).getLogin().equals(login)) {
				
				System.out.println(); 
				System.out.print("Digite sua senha:	");
				senha = scan.next();
				if(g.getRep().getOperador().get(i).getSenha().equals(senha)) {
					matOps = i;
					menuOPS(rep, prd, g, loc,matOps);
				}
				else {
					System.out.println("Erro ao realizar login do operador de sistema, veirifique sua senha!");
					loginOPS(rep, prd, g, loc);
				}
			}
			else {
				System.out.println("Erro ao realizar login do operador de sistema, veirifique seu login!");
				loginOPS(rep, prd, g, loc);
			}	
		}
	}
	
	
// MENU DO GERENTE	
	static void menuGerente(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		
				// VerificaÃ§Ã£o
			System.out.println("****Olá Gerente "+ g.getNome()+"****");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Cadastrar Cliente");
			System.out.println("3 - Cadastrar Operador");
			System.out.println("4 - Listar Produtos");
			System.out.println("5 - Listar Clientes");
			System.out.println("6 - Listar Operadores");
			System.out.println("7 - Procurar produto");
			System.out.println("8 - Procurar Cliente");
			System.out.println("9 - Procurar Operador");
			System.out.println("10 - Sair");
			System.out.print("Digite a opção: ");
			escolha = scan.nextInt();
			
				switch (escolha){ 
	            case 1:
                        
                        System.out.println("Código:");
                        String codigo = scan.next();
                        scan.nextLine();
                        System.out.println("TÃ­tulo:");
                        String titulo = scan.nextLine();
                        
                        System.out.println("Gênero:");
                        String genero = scan.nextLine();
                        System.out.println("Status de locado:");
                        boolean locado = scan.nextBoolean();
                        
                        g.adicionarProdutoQualquer(codigo, titulo, genero, locado);
                        
	                menuGerente(rep,prd,g,loc);
	                break;
	            case 2:
                        System.out.println("Matricula:");
                        int matricula = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Nome:");
                        String nome = scan.nextLine();
                        
                        System.out.println("Endereço:");
                        String end = scan.nextLine();
                        
                        System.out.println("Idade:");
                        int idade = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Sexo:");
                        char sexo = (char)System.in.read();
                        g.adicionarCliente(end, idade, sexo, nome, matricula);
	            	menuGerente(rep,prd,g,loc);
	                break;
	            case 3:
                        System.out.println("Matricula:");
                        int matr = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Nome:");
                        String nom = scan.nextLine();
                        System.out.println("Login:");
                        String login = scan.nextLine();
                        System.out.println("Senha:");
                        String senha = scan.nextLine();
                        g.adicionarOperador(nom, matr, login, senha);
	            	menuGerente(rep,prd,g,loc);
	                break;
	            case 4:
                        for (Produto i : g.getPrd().getP().values()) {
                            System.out.println("Código:"+i.getCodigo()+" "+"Título:"+i.getTitulo());
                        }
	            	menuGerente(rep,prd,g,loc);
	                break;
				case 5: 
                                        g.listarClientes(rep, g);
					menuGerente(rep,prd,g,loc);
	    			break;
				case 6: 
                                        g.listarOperador(rep, g);
					menuGerente(rep,prd,g,loc);
	    			break; 
				case 7:
                                        System.out.println("Digite o Código:");
                                        String cod = scan.next();
                                        g.procurarProduto(prd, g, cod);
					menuGerente(rep,prd,g,loc);
	    			break; 
				case 8:  
                                        System.out.println("Digite a Matricula:");
                                        int mat = scan.nextInt();
                                        g.procurarCliente(prd, g, mat);
					menuGerente(rep,prd,g,loc);
	    			break;
				case 9:
                                        System.out.println("Digite a Matricula:");
                                        int mati = scan.nextInt();
                                        g.procurarOperador(prd, g, mati);
					menuGerente(rep,prd,g,loc);
	    			break; 
				case 10: 
					saida(rep,prd,g,loc);
	    			break;
	    		default:
	
	        }	
	}
	
// MENU DO OPERADOR DE SISTEMA	
	static void menuOPS(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc, int matOps) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
	
			System.out.println("****Olá¡ Operador de Sistema "+ g.getRep().getOperador().get(matOps).getNome() +" ****");
			System.out.println("1 - Fazer locação");
			System.out.println("2 - Dar baixa em locação");
			System.out.println("3 - Excluir locaÃ§Ã£o");
			System.out.println("4 - Procurar Produto");
			System.out.println("5 - Procurar Clientes");
			System.out.println("6 - Sair");
			System.out.print("Digite a opçãoo: ");
			escolha = scan.nextInt();
			
				switch (escolha){ 
	            case 1: 
                        System.out.println("Matricula:");
                        int matr = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Código:");
                        String codigo = scan.next();
                        scan.nextLine();
                        System.out.println("Dia:");
                        int dia = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Mês:");
                        int mes = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ano:");
                        int ano = scan.nextInt();
                        mes--;
                        Calendar data_saida = Calendar.getInstance();
                        data_saida.set(Calendar.YEAR,ano);
                        data_saida.set(Calendar.MONTH,mes);
                        data_saida.set(Calendar.DAY_OF_MONTH,dia);
                        Calendar data_entrega = Calendar.getInstance();
                        data_entrega.set(Calendar.YEAR,ano);
                        data_entrega.set(Calendar.MONTH,mes);
                        data_entrega.set(Calendar.DAY_OF_MONTH,dia);
                        data_entrega.add(Calendar.DAY_OF_MONTH,2);
                        OperadorDeSistema op = new OperadorDeSistema(loc);
                        op.adicionarLocacao(codigo, matr, data_saida, data_entrega);
	            	menuOPS(rep,prd,g,loc,matOps);
	                break;
	            case 2:
                        System.out.println("Matricula:");
                        int mat = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Código:");
                        String cod = scan.next();
                        scan.nextLine();
                        OperadorDeSistema opp = new OperadorDeSistema(loc);
                        int valor = opp.darBaixa(mat, cod);
                        System.out.println(valor);
	            	menuOPS(rep,prd,g,loc,matOps);
	                break;
	            case 3:
                        System.out.println("Matricula:");
                        int m = scan.nextInt();
                        OperadorDeSistema op4 = new OperadorDeSistema(loc);
                        op4.excluirLocacao(m);
	            	menuOPS(rep,prd,g,loc,matOps);
	                break;
	            case 4:
                        System.out.println("Código:");
                        String co = scan.next();
                        scan.nextLine();
                        OperadorDeSistema op1 = new OperadorDeSistema(loc);
                        op1.procurarProd(co);
	            	menuOPS(rep,prd,g,loc,matOps);
	                break;
				case 5: 
                                        System.out.println("Matricula:");
                                        int mt = scan.nextInt();
                                        OperadorDeSistema op2 = new OperadorDeSistema(loc);
                                        op2.procurarCli(mt);
					menuOPS(rep,prd,g,loc,matOps);
	    			break;
				case 6: 
					saida(rep,prd,g,loc);
	    			break; 
				default: 
				}	
	}
	
// SAIDAS 
	static void saida(RepositorioPessoa rep, RepositorioProduto prd,Gerente g,RepositorioLocacao loc) throws IOException {
		telaInicial(rep,prd,g,loc);
		
	}
	static void saidaFinal() {
		System.exit(0);
	}
}
