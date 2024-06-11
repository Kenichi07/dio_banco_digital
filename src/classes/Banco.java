package classes;

import java.util.Scanner;

public class Banco {
	private String nome;
	ContaCorrente cc = new ContaCorrente();
	ContaPoupanca cp = new ContaPoupanca();
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void menuInicial() {
		Scanner menu = new Scanner (System.in);
		boolean inicio = true;
		while (inicio) {

			System.out.print("              Menu             \n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("| Opção 1 - Conta Corrente    |\n");
	        System.out.print("| Opção 2 - Conta Poupança    |\n");
	        System.out.print("| Opção 3 - Sair              |\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("Digite uma opção: ");
	                
	        int opcao = menu.nextInt();
	
	        switch (opcao) {
		        case 1:
		            System.out.println("Conta Corrente escolhida.");
		            menuConta(cc);
		            break;
		        case 2:
		        	System.out.println("Conta Poupança escolhida.");
		        	menuConta(cp);
		            break;
		        case 3:
		        	System.out.print("\nSaindo!");
		            menu.close();
		            inicio = false;
		            break;
		        default:
	                System.out.print("\nOpção Inválida!");
	                break;
	        }
		}
	}
	
	
	public void menuConta(Conta conta) {
		Scanner menu = new Scanner (System.in);
		boolean inicio = true;
		while (inicio) {

			System.out.print("              Menu             \n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("| Opção 1 - Sacar             |\n");
	        System.out.print("| Opção 2 - Depositar         |\n");
	        System.out.print("| Opção 3 - Transferir        |\n");
	        System.out.print("| Opção 4 - Extrato           |\n");
	        System.out.print("| Opção 5 - Voltar            |\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("Digite uma opção: ");
	                
	        int opcao = menu.nextInt();
	
	        switch (opcao) {
		        case 1:
		            System.out.println("Digite o valor de saque: ");
		            int valorSaque = menu.nextInt();
		            conta.sacar(valorSaque);
		            break;
		        case 2:
		        	System.out.println("Digite o valor de deposito: ");
		        	int valorDeposito = menu.nextInt();
		        	conta.depositar(valorDeposito);
		            break;
		        case 3:
		        	System.out.println("Digite o valor de transferencia: ");
		        	int valorTransferencia = menu.nextInt();
		        	System.out.println("Digite 1 ou 2, 1 para conta corrente e 2 para conta poupança: ");
		        	int numero = menu.nextInt();
		        	if (numero == 1) {
		        		conta.transferir(valorTransferencia, cc);
		        		break;
		        	} else {
		        		conta.transferir(valorTransferencia, cp);
		        		break;
		        	}
		        case 4:
		            conta.imprimirExtrato();
		            break;
		        case 5:
		            menuInicial();
		            menu.close();
		            break;
		        default:
	                System.out.print("\nOpção Inválida!");
	                break;
	        }
		}
	}
}
