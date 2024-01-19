import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_funcionario = sc.nextInt();
		int numero_horas = sc.nextInt();
		double salario_hora = sc.nextDouble();
		
		double calculo_salario = numero_horas * salario_hora;
		
		System.out.printf("NUMBER = %d%n", numero_funcionario);
		System.out.printf("SALARY = %.2f", calculo_salario);
		
		
		sc.close();
	}

}
