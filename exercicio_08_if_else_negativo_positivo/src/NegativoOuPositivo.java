import java.util.Scanner;

public class NegativoOuPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Nao negativo");
		} 
		
		else {
			System.out.println("Negativo");
		}
				
		sc.close();

	}

}
