package entities;

public class Funcionarios {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	
	public double salarioLiquido() {
		 return salarioBruto - imposto;
		
	}
	
	public double aumentoSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100;
			
	}
	public String toString() {
		return name + ", "
				+ "$ " 
				+ String.format("%.2f", salarioLiquido());
	}

}

