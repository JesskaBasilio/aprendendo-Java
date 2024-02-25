package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//adicionando um elemento na posição 2:
		
		list.add(2, "Marcos");
		
		//verificando o tamanho da lista:
		
		System.out.println(list.size());		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		//removendo um elemento da lista, no caso a 'Anna':		
		//list.remove("Anna");		
		//removendo o elemento que está na posição 1:		
		//list.remove(1); 		
		//removendo por predicados, digamos que quero remover os elementos que
		//começam com a letra 'M':
		
		list.removeIf(x -> x.charAt(0) == 'M'); 
		//lê-se: remover todo o string x tal que x.charAt(0) começa em 'M';
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");		
		//encontrando a posição de um elemento:		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		//tentando encontrar um elemento que não está na lista, retorno é -1		
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		
		System.out.println("-----------------------");
		//imprimindo somente os elementos que inciam com a letra 'A':
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		//encontrando o primeiro elemento que começa com a letra 'A':
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------------");
		//encontrando o primeiro elemento que começa com a letra 'J', retornará null:
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
	}

}
