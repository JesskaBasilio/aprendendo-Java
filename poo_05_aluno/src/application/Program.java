package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Informe as 3 notas do aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.somarNota());
		
		if (aluno.somarNota() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points ", aluno.notaRestante());
		} else {
			System.out.println("Pass");
		}
		
		sc.close();

	}

}
