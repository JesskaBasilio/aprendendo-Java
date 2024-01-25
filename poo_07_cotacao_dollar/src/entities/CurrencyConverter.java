package entities;

public class CurrencyConverter {
	public final static double P = 0.06;
	public static double price;
	public static double quantity;
	
	
	public static double paid() {
		double soma = price * quantity; 
		double op = soma * P;
		double result = soma + op;
		return result;
	}

}
