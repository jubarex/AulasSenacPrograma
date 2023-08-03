package projeto1;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int c = -1, i1 = 0, i2 = 0;
		
		System.out.println("diga me 1 valor");
		while(c != 0) {
			c = teclado.nextInt();
			if(c %2 == 0){
				System.out.println("o valor de " + c + " é par");	
				i1 ++;
			}
			else{
				System.out.println("o valor de " + c + " é impar");	
				i2 ++;
				}	
		}
		System.out.println("o intervalo 1 teve " + i1 + " números");
		System.out.println("o intervalo 2 teve " + i2 + " números");
	}
}