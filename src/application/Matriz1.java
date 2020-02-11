package application;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();
		System.out.print("Numeros negativos: " + count);
		scan.close();
	}

}
