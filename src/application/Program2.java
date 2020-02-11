  
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Product2> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("Id: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Salario: ");
			double salary = scan.nextDouble();
			list.add(new Product2(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
		int id = scan.nextInt();
		Product2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este Id nao existe!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double percentage = scan.nextDouble();
			emp.incrementoSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("Lista dos funcionarios:");
		for (Product2 mostra : list) {
			System.out.println(mostra);
		}
				
		scan.close(); 
	}
}