package projeto1;

import java.util.Scanner;

public class q2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 , n2;
		System.out.println("Diga um valor");
		n1 = teclado.nextInt();
		
		System.out.println("Diga outro valor");
		n2 = teclado.nextInt();
		
		if(n1 == n2) {
			System.out.println((n1 * n2 ) * 2);
		}else {
			System.out.println(n1 + n2);
		}
	
	}
	
}