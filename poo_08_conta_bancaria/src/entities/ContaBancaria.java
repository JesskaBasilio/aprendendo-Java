package entities;

public class ContaBancaria {
	
	private int number;
	private String holder;
	private double balance;
	
	public ContaBancaria(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public ContaBancaria(int number, String holder, double inicialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void saque(double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}


}
