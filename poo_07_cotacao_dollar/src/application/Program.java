package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("What's the dollar price: ");
		CurrencyConverter.price = sc.nextDouble();
		
		System.out.println("How many dollars you will bougth? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f",
				CurrencyConverter.paid());
		
		
		sc.close();


	}

}
