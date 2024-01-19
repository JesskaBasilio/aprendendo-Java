import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % x == 0) {
			if (y % x == 0) {
				System.out.println("Multiplos");
			}
			else {
				System.out.println("Nao sao multiplos");
			}
			
		}
		sc.close();

	}

}
