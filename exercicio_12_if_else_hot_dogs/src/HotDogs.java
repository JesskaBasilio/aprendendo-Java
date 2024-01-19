import java.util.Locale;
import java.util.Scanner;

public class HotDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double codigo_item = sc.nextInt();
		double quantidade_item = sc.nextInt();
		
		
		
		if (codigo_item == 1) {		
			double cachorro_quente = 4.00;
			double resultado = (quantidade_item) * (cachorro_quente);
			System.out.println(resultado);
			
		}
		else if (codigo_item == 2) {
			double x_salada = 4.50;
			double resultado = (quantidade_item) * (x_salada);
			System.out.println(resultado);
			
		}
		else if (codigo_item == 3) {
			double x_bacon = 5.00;
			double resultado = (quantidade_item) * (x_bacon);
			System.out.println(resultado);
		}
		else if (codigo_item == 4) {
			double torrada_Simples = 2.00;
			double resultado = (quantidade_item) * (torrada_Simples);
			System.out.println(resultado);
		}
		else if (codigo_item == 5) {
			double refrigerante = 1.50;
			double resultado = (quantidade_item) * (refrigerante);
			System.out.println(resultado);
		}
		else {
			System.out.println("Muito obrigada");
		}
		
		System.out.println("Muito obrigada pela preferencia! Volte sempre!");
		
		sc.close();


	}

}
