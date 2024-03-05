package application;

import java.util.Scanner;

import entities.FibonacciCalculator;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solicitar ao usuário que digite um número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para verificar se pertence a sequencia de Fibonacci: ");

        // Ler o número digitado pelo usuário
        int numeroVerificar = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (FibonacciCalculator.isFibonacci(numeroVerificar)) {
            System.out.println(numeroVerificar + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numeroVerificar + " nao pertence a sequência de Fibonacci.");
        }

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
	
}

    
       