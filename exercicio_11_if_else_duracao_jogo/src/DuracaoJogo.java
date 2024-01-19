import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hora_inicial = sc.nextInt();
		int hora_final = sc.nextInt();

		if (hora_inicial > hora_final) {
			int resultado_inicial = 24 - hora_inicial;
			int resultado_final = 0 + hora_final;
			int duracao_jogo = resultado_inicial + resultado_final;
			System.out.printf("O jogo durou %d hora(s)", duracao_jogo);
		} 
		else if (hora_inicial == 0 && hora_final == 0){
			System.out.println("O jogo durou 24 horas");
		} 
		else {
			int duracao_jogo = hora_final - hora_inicial;
			System.out.printf("O jogo durou %d hora(s)", duracao_jogo);
		}
		
		sc.close();

	}

}
