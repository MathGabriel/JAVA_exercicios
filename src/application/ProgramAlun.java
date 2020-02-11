package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class ProgramAlun {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.p1 = sc.nextDouble();
		aluno.p2 = sc.nextDouble();
		aluno.p3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", aluno.passou());
		}
		else {
		System.out.println("PASS");
		}
		
		sc.close();
	}
}