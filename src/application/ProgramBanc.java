package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class ProgramBanc {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine(); 
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorInicial = scan.nextDouble();
			banco = new Banco(number, holder, valorInicial);
		}else {
			banco = new Banco(number,holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double valor_deposito = scan.nextDouble();
		banco.deposito(valor_deposito);
		System.out.println("Updated account data: ");
		System.out.println("banco");

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double saque = scan.nextDouble();
		banco.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println("banco");

		scan.close();
	}
}