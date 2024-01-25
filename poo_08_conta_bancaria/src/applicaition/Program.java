package applicaition;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			ContaBancaria account;
			
			System.out.print("Cadastre o numero da conta: ");
			int number = sc.nextInt();
			System.out.print("Digite o nome do titular: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Tem deposito inicial (y/n)? ");
			char response = sc.next().charAt(0);
			if(response == 'y') {
				System.out.print("Entre com o valor do deposito inicial: ");
				double inicialDeposit = sc.nextDouble(); 
				account = new ContaBancaria(number, holder, inicialDeposit);
			}
			else {
				account = new ContaBancaria(number, holder);
			}
			
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(account);
			
			System.out.println();
			System.out.print("Entre com o valor de deposito: ");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
			System.out.println("Update account data: ");
			System.out.println(account);
			
			System.out.println();
			System.out.print("Entre com o valor de saque: ");
			double withdrawValue = sc.nextDouble();
			account.saque(withdrawValue);
			System.out.println("Update account data: ");
			System.out.println(account);			
			
			
			sc.close();

	}

}
