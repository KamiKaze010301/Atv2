package Main;
import java.util.HashMap;
import java.util.Scanner;
import Atores.Pessoa;
import Atores.Cliente;


public class Main {

	public static void main(String[] args) {
		telaInicial();
	}
	
//			TELA INICIAL
	static void telaInicial(){
		Scanner scan = new Scanner(System.in);
		int escolha;
		

		System.out.println("****Bem-vindo, escolha um perfil abaixo:****");
		System.out.println("1 – Gerente");
		System.out.println("2 – Operador de Sistema");
		System.out.println("3 – Sair");
		escolha = scan.nextInt();
		
		switch (escolha){
		case 1:
			loginGerente();
			break;
		case 2:
			loginOPS();
			break;
		case 3:
			saidaFinal();
			break;
		default:
			
		}		
		
	}
	
//		LOGIN DE GERENTE
	static void loginGerente() {
		
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
		menuGerente();
		
	}
	
	static void loginOPS() {
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
				menuOPS();
		
	}
	
	static void menuGerente() {
		
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
			System.out.println("8 – Procurar Cliente");
			System.out.println("9 – Procurar Operador");
			System.out.println("10 – Sair");
			System.out.print("Digite a opção: ");
			escolha = scan.nextInt();
			
				switch (escolha){ 
	            case 1: 
	                
	                break;
	            case 2: 
	                
	                break;
	            case 3: 
	                
	                break;
	            case 4: 
	                
	                break;
				case 5: 
	    
	    			break;
				case 6: 
				    
	    			break; 
				case 7: 
				    
	    			break; 
				case 8: 
				    
	    			break;
				case 9: 
				    
	    			break; 
				case 10: 
					saida();
	    			break;
	    		default:
	
	        }	
	}
	
	
	static void menuOPS() {
		
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
	                
	                break;
	            case 2: 
	                
	                break;
	            case 3: 
	                
	                break;
	            case 4: 
	                
	                break;
				case 5: 
	    
	    			break;
				case 6: 
					saida();
	    			break; 
				default: 
				}	
	}
	
	static void saida() {
		telaInicial();
		
	}
	static void saidaFinal() {
		System.exit(0);
	}
}
