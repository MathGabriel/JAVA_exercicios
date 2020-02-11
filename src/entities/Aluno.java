package entities;

public class Aluno {
	public String nome;
	public double p1;
	public double p2;
	public double p3;

	public double notaFinal() {
		return p1 + p2 + p3;
	}

	public double passou() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
