package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product1;

public class Program1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product1 product = new Product1();
	
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = scan.nextLine();
		
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = scan.nextInt();
	
		System.out.println("Product data: "+ product);
		//daria no mesmo a linha de cima de colocar "product.toString()"
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: "+ product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: "+ product);
		
		scan.close();
	}

}
