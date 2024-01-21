package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somarNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaRestante() {
		if(somarNota() < 60) {
			return 60 - somarNota();
		} else {
			return 0.0;
		}
	}

}
