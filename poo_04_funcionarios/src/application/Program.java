package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Funcionarios funcionarios = new Funcionarios();
			
			System.out.println("Digite o nome do funcionario: ");
			funcionarios.name = sc.next();
			System.out.println("Digite o salario bruto do funcionario: ");
			funcionarios.salarioBruto = sc.nextDouble();
			System.out.println("Digite o valor do imposto a ser cobrado: ");
			funcionarios.imposto = sc.nextDouble();
			
			System.out.println("Funcionario: " + funcionarios);
			
			System.out.println("Digite a porcentagem de aumento no salario: ");
			double porcentagem = sc.nextDouble();
			funcionarios.aumentoSalario(porcentagem);
			
			System.out.println("Atualizacao dos dados " 
			+ funcionarios);
			
			sc.close();


	}

}
