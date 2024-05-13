package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: conhecer e importar a classe scanner
		// exibir as mensagens para o usuário
		// obter pelo scanner os valores digitados no terminal
		// exibir a mensagem de conta criada
		
		String numeroConta;
		int agencia;
		String nomeCliente;
		double saldo;
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Por favor, digite o seu nome:");
		nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o número da agência:");
		agencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da conta:");
		numeroConta = scanner.next();
		
		System.out.println("Por favor, digite o saldo para saque:");
		saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +
				" já está disponível para saque!");
		
		
		scanner.close();
	}
	
}
