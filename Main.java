package Main;
import java.util.HashMap;
import java.util.Scanner;
import Atores.Pessoa;
import Atores.Cliente;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int escolha;
		String login;
		String senha;

// 				PRIMEIRA TELA
		System.out.println("****Bem-vindo, escolha um perfil abaixo:****");
		System.out.println("1 � Gerente");
		System.out.println("2 � Operador de Sistema");
		System.out.println("3 � Sair");
		escolha = scan.nextInt();
		
// 				LOGIN DE GERENTE
		if(escolha == 1) {
			escolha = 0;
			System.out.println("****Fa�a seu Login****");
			System.out.print("Digite seu login:	");
			login = scan.next();
			System.out.println(); 
			System.out.print("Digite sua senha:	");
			senha = scan.next();
				// Verifica��o
			System.out.println("****Ol� Gerente <Nome do Gerente>****");
			System.out.println("1 � Cadastrar Produto");
			System.out.println("2 � Cadastrar Cliente");
			System.out.println("3 � Cadastrar Operador");
			System.out.println("4 � Listar Produtos");
			System.out.println("5 � Listar Clientes");
			System.out.println("6 � Listar Operadores");
			System.out.println("8 � Procurar Cliente");
			System.out.println("9 � Procurar Operador");
			System.out.println("10 � Sair");
			System.out.print("Digite a op��o: ");
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
//				LOGIN DE GERENTE
		else if(escolha == 2) {
			System.out.println("****Fa�a seu Login****");
			System.out.print("Digite seu login:	");
			login = scan.next();
			System.out.println(); 
			System.out.print("Digite sua senha:	");
			senha = scan.next();
			
			// Verifica��o
			System.out.println("****Ol� Gerente <Nome do Gerente>****");
			System.out.println("1 � Fazer loca��o");
			System.out.println("2 � Dar baixa em loca��o");
			System.out.println("3 � Excluir loca��o");
			System.out.println("4 � Procurar Produto");
			System.out.println("5 � Procurar Clientes");
			System.out.println("6 � Sair");
			System.out.print("Digite a op��o: ");
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

//				SAIDA		
		else if(escolha == 3) {
			saida();
		}
		
		
	}
	
	static void saida() {
		System.out.println("Saiu");
	}
	

}
