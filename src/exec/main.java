
package exec;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class main {
    public static void main(String[] args) throws IOException {
        RepositorioPessoa rep = new RepositorioPessoa();
        RepositorioProduto prd = new RepositorioProduto();
        Gerente g = new Gerente(rep, prd, "Admin", 1, "admin", "admin");
        telaInicial(rep,prd,g);
	}
       
//			TELA INICIAL
	static void telaInicial(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException{
		Scanner scan = new Scanner(System.in);
		int escolha;
		

		System.out.println("****Bem-vindo, escolha um perfil abaixo:****");
		System.out.println("1 – Gerente");
		System.out.println("2 – Operador de Sistema");
		System.out.println("3 – Sair");
		escolha = scan.nextInt();
		
		switch (escolha){
		case 1:
			loginGerente(rep,prd,g);
			break;
		case 2:
			loginOPS(rep,prd,g);
			break;
		case 3:
			saidaFinal();
			break;
		default:
			
		}		
		
	}
	
//		LOGIN DE GERENTE
	static void loginGerente(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException {
		
		int escolha;
		String login;
		String senha;
		Scanner scan = new Scanner(System.in);
		
		escolha = 0;
		System.out.println("****Faça seu Login****");
		System.out.print("Digite seu login:	");
		login = scan.next();
		System.out.println(); 
		System.out.print("Digite sua senha:	");
		senha = scan.next();
		//Necessaria uma verificação
		//se virificado
		menuGerente(rep,prd,g);
		
	}
	
// LOGIN DO OPERADOR DE SISTEMA
	static void loginOPS(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException {
		int escolha;
		String login;
		String senha;
		Scanner scan = new Scanner(System.in);
		
		escolha = 0;
		
		System.out.println("****Faça seu Login****");
		System.out.print("Digite seu login:	");
		login = scan.next();
		System.out.println(); 
		System.out.print("Digite sua senha:	");
		senha = scan.next();
		//Necessaria uma verificação
				//se virificado
				menuOPS(rep,prd,g);
		
	}
	
	
// MENU DO GERENTE	
	static void menuGerente(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		
				// Verificação
			System.out.println("****Olá Gerente <Nome do Gerente>****");
			System.out.println("1 – Cadastrar Produto");
			System.out.println("2 – Cadastrar Cliente");
			System.out.println("3 – Cadastrar Operador");
			System.out.println("4 – Listar Produtos");
			System.out.println("5 – Listar Clientes");
			System.out.println("6 – Listar Operadores");
			System.out.println("7 – Procurar produto");
			System.out.println("8 – Procurar Cliente");
			System.out.println("9 – Procurar Operador");
			System.out.println("10 – Sair");
			System.out.print("Digite a opção: ");
			escolha = scan.nextInt();
			
				switch (escolha){ 
	            case 1:
                        
                        System.out.println("Código:");
                        String codigo = scan.next();
                        scan.nextLine();
                        System.out.println("Título:");
                        String titulo = scan.nextLine();
                        
                        System.out.println("Gênero:");
                        String genero = scan.nextLine();
                        System.out.println("Disponível:");
                        boolean locado = scan.nextBoolean();
                        
                        g.adicionarProdutoQualquer(codigo, titulo, genero, locado);
                        System.out.println(g.getPrd().getP().get(codigo).getCodigo());
	                menuGerente(rep,prd,g);
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
                        System.out.println(g.getRep().getPessoas().get(matricula).getNome());
	            	menuGerente(rep,prd,g);
	                break;
	            case 3: 
	            	menuGerente(rep,prd,g);
	                break;
	            case 4:
                        for (Produto i : g.getPrd().getP().values()) {
                            System.out.println(i.getTitulo());
                        }
	            	menuGerente(rep,prd,g);
	                break;
				case 5: 
                                        g.listarClientes(rep, g);
					menuGerente(rep,prd,g);
	    			break;
				case 6: 
					menuGerente(rep,prd,g);
	    			break; 
				case 7: 
					menuGerente(rep,prd,g);
	    			break; 
				case 8: 
					menuGerente(rep,prd,g);
	    			break;
				case 9: 
					menuGerente(rep,prd,g);
	    			break; 
				case 10: 
					saida(rep,prd,g);
	    			break;
	    		default:
	
	        }	
	}
	
// MENU DO OPERADOR DE SISTEMA	
	static void menuOPS(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
	
			System.out.println("****Olá Operador de Sistema <Nome do Operador de Sistema>****");
			System.out.println("1 – Fazer locação");
			System.out.println("2 – Dar baixa em locação");
			System.out.println("3 – Excluir locação");
			System.out.println("4 – Procurar Produto");
			System.out.println("5 – Procurar Clientes");
			System.out.println("6 – Sair");
			System.out.print("Digite a opção: ");
			escolha = scan.nextInt();
			
				switch (escolha){ 
	            case 1: 
	            	menuOPS(rep,prd,g);
	                break;
	            case 2: 
	            	menuOPS(rep,prd,g);
	                break;
	            case 3: 
	            	menuOPS(rep,prd,g);
	                break;
	            case 4: 
	            	menuOPS(rep,prd,g);
	                break;
				case 5: 
					menuOPS(rep,prd,g);
	    			break;
				case 6: 
					saida(rep,prd,g);
	    			break; 
				default: 
				}	
	}
	
// SAIDAS 
	static void saida(RepositorioPessoa rep, RepositorioProduto prd,Gerente g) throws IOException {
		telaInicial(rep,prd,g);
		
	}
	static void saidaFinal() {
		System.exit(0);
	}
}
