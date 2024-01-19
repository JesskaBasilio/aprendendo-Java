import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		/*triangulo = base * altura / 2 
		circulo = pi * raio ^ 2  
		trapezio = base1 + base2 * altura / 2 
		quadrado = b ^ 2 ---- 
		retangulo = base * altura */
		
		double area_triangulo = (a * c) / 2;
		double area_circulo = pi * Math.pow(c, 2.0);
		double area_trapezio = ((a + b) * c) / 2;
		double area_quadrado = Math.pow(b, 2.0);
		double area_retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO:%.3f%n"
				+ "QUADRADO: %.3f%nRETANGULO: %.3f%n", area_triangulo, 
				area_circulo, area_trapezio, area_quadrado, area_retangulo);
		
		sc.close();

	}

}
