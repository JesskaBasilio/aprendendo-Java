package application;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria", "Joao", "Thiago"};
		
		for (int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------");
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
