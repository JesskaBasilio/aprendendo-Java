import java.util.Locale;
import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo_peca1 = sc.nextInt();
		int quantidade_peca1 = sc.nextInt();
		double valor_peca1 = sc.nextDouble();
		
		double total_peca1 = (double)quantidade_peca1 * valor_peca1;
		
		int codigo_peca2 = sc.nextInt();
		int quantidade_peca2 = sc.nextInt();
		double valor_peca2 = sc.nextDouble();
		
		double total_peca2 = (double)quantidade_peca2 * valor_peca2;
		double resultado_final = total_peca1 + total_peca2;
		
		System.out.printf("Valor a pagar: %.2f", resultado_final);
		
		sc.close();

	}

}
