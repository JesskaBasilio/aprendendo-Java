package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produto = new Product();
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		produto.name = sc.nextLine();
		
		System.out.print("Valor: ");
		produto.price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantity = sc.nextInt();
		
		System.out.println("Product Data: " + produto);
		
		System.out.print("Entre com o numero de produtos a adicionar: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("Update Data: " + produto);
		
		System.out.print("Entre com o numero de produtos a remover: ");
		quantity = sc.nextInt();
		produto.removeProduts(quantity);
		
		System.out.println("Update Data: " + produto);
		
		sc.close();
	}

}
