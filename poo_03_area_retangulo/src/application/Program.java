package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base e da altura do retangulo: ");
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		
		sc.close();
	}

}
