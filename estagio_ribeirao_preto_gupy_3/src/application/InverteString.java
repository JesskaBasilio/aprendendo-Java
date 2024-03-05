package application;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Você pode definir a string diretamente no código ou solicitar ao usuário
        // Aqui, vou solicitar ao usuário que insira a string
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        
        // Invertendo a string
        String invertedString = inverterString(inputString);

        // Exibindo a string invertida
        System.out.println("String original: " + inputString);
        System.out.println("String invertida: " + invertedString);
        
        scanner.close();
    }

    // Função para inverter a string
    private static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            // Trocando os caracteres nas posições inicio e fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Movendo os índices
            inicio++;
            fim--;
        }

        // Construindo a string invertida a partir do array de caracteres
        return new String(caracteres);
    }

}


