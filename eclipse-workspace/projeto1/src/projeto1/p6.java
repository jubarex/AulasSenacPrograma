package projeto1;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int d = 0, e;
		System.out.println("Diga um valor");
		d = teclado.nextInt();
		e = d;
		
		while(e != 2) {
			e = e - 1;
			d = d * e;
			System.out.println(d);
			
		}
	}
}
