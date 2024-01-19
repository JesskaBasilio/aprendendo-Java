
public class Preco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco = 34.20;
		double desconto;
		
		if (preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.5;
		}
		System.out.println(desconto);
		
		// condição ternária
		
		double desconto1 = (preco < 20) ? preco * 0.1 : preco * 0.5;
		System.out.println(desconto1);

	}

}
