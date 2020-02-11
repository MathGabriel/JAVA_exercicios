package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramEmpl {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee empl = new Employee();
		
		System.out.print("Name: ");
		empl.name = scan.nextLine();
		System.out.print("Gross salary: ");
		empl.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		empl.tax = scan.nextDouble();
		
		System.out.println("Employee: " + empl);
		System.out.print("Whitch percentage to increase salary? ");
		double increase = scan.nextDouble();
		empl.increaseSalary(increase);
		
		System.out.println();
		System.out.println("Update data: " + empl);
		
		scan.close();
	}
	
}
