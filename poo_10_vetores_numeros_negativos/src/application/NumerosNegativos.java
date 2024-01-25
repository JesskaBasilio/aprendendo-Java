package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int numeros = sc.nextInt() ;
		int vetor[] = new int[numeros];
		
		for (int i = 0; i < vetor.length; i ++) {
			System.out.println("Digite um numero: ");
			vetor[i] =  sc.nextInt();
			}
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
	
		
		sc.close();

	}


}
