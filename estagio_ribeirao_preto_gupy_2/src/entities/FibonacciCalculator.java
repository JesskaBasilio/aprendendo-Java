package entities;

public class FibonacciCalculator {
	
	 // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;

        while (b < number) {
            int temp = a + b;
            a = b;
            b = temp;
       }
        
        return b == number;
    }
}
