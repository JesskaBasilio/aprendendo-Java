package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1)+ ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Funcionario emp = new Funcionario(id, name, salary);
			
			list.add(emp);			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Funcionario emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}
	
	/*Criando uma função para procurar um elemento na lista, ela vai retornar um Integer
	 * que será a posição do elemento na lista*/
	
	public static Integer position(List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null; /*se a função for declarada como public int position, esse retorno será -1*/
	}

}



/* Fazer um programa para ler um número inteiro N e depois os dados
 * (id, nome e salario) de N funcionários. Não deve ter repetição de
 * id.
 * 
 * Em seguida efetuar um aumento de X por cento no salário de um
 * determinado funcionário. Para isso, o programa deve ler um id 
 * e o valor de X. Se o id informado não existir, mostrar uma mensagem
 * e abortar a operação. Ao final, mostrar a mensagem atualizada dos 
 * funcionários, conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir
 * que o salaário seja mudado livremente. Um salário só pode ser aumentado
 * em uma operação de aumento por porcentagem dada.
 * 
 * exemplo:
 * 
 * How many employees will be registered? 3
 * 
 * Employee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Employee #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 * Employee #3:
 * Id: 772
 * Name: Bob Green
 * Salary: 5000.00
 * 
 * Enter the employee id that will have salary increase: 536
 * 
 * Enter the percentage: 10.0
 * 
 * List of employees:
 * 333, Maria Brown, 4000.00
 * 536, Alex Grey, 3300.00
 * 772, Bob Green, 5000.00 
 * 
 * --------------Another situation:----------------
 * 
 * How many employees will be registered? 3
 * 
 * Employee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Employee #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 *  
 * Enter the employee id that will have salary increase: 776
 * This Id does not exist!
 * 
 * List of employees:
 * 333, Maria Brown, 4000.00
 * 536, Alex Grey, 3300.00
 * 
 * */
