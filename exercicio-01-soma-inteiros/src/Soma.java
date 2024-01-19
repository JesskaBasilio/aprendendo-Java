import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite dois numeros: ");
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
