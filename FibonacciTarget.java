package application;

import java.util.Locale;
import java.util.Scanner;

public class FibonacciTarget {
	
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero para sequencia Fibonacci: ");
		int num = sc.nextInt();
		
		boolean pertence = false;
		for (int i = 0; i < num; i++) {
            System.out.print(FibonacciTarget.fibo(i) + ", ");
            if (FibonacciTarget.fibo(i) == num) {
            	pertence = true;
            }
        }
		if (pertence == true) {
			System.out.println("\n\nO numero informado pertence a sequência!");
		}else {
			System.out.println("\n\nO numero informado não pertence a sequência!");
		}
		sc.close();
	}

}
