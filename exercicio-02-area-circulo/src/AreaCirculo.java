import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int raio;
		double pi = 3.1415;
		
		
		System.out.println("Digite o valor do raio");
		raio = sc.nextInt();
		double area = pi * (raio * raio);
		
		System.out.printf("%.4f", area);
		
		sc.close();
		

	}

}
