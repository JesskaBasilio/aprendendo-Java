import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
				
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1 = (-(b) + (Math.sqrt(delta))) / (2 * a);
		double x2 = (-(b) - (Math.sqrt(delta))) / (2 * a);
		System.out.printf("x' = %.2f%n", x1);
		System.out.printf("x'' =  %.2f%n", x2);
		
		sc.close();

	}

}
