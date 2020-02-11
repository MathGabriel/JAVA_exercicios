package entities;

public class Banco {
	
	private int account;
	private String name;
	private double value;
	
	public Banco(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public Banco(int account, String name, double dinheiroInicial) {
		this.account = account;
		this.name = name;
		deposito(dinheiroInicial);
	}
	
	// mostra o nmr da conta do user
	public double getAccount() {
		return account;
	}
	// mostra o nome do usuario
	public String getName() {
		return name;
	}
	// altera o nome do user
	public void setName(String name) {
		this.name = name;
	}
	// mostra o valor da conta do user
	public double getValue() {
		return value;
	}
	
	public void deposito(double dinheiro) {
		 value += dinheiro;
	}
	
	public void saque(double dinheiro) {
		value -= dinheiro + 5.0; 
	}
	
	public String toString() {
		return "Account "
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", value);
	}
}
