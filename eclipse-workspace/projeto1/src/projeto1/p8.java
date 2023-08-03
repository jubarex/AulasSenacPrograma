package projeto1;

import java.util.Scanner;

import java.util.Random;

public class p8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		//2
			int c = -1, i1 = 0, i2 = 0, i3 = 0, i4 = 0;
			System.out.println("diga me 1 valor");
			while(c != 0) {
				c = teclado.nextInt();
				if(c >= 1 && c<= 25){
					System.out.println("o valor de " + c + " está entre 1 e 25");	
					i1 ++;
				}
				if(c >= 26 && c<= 50){
					System.out.println("o valor de " + c + " está entre 26 e 50");	
					i2 ++;
				}
				if(c >= 51 && c<= 75){
					System.out.println("o valor de " + c + " está entre 51 e 75");	
					i3 ++;
				}
				if(c >= 76 && c<= 100){
					System.out.println("o valor de " + c + " está entre 76 e 100");	
					i4 ++;
				}
				System.out.println("o intervalo 1 teve " + i1 + "números");
				System.out.println("o intervalo 2 teve " + i2 + "números");
				System.out.println("o intervalo 3 teve " + i3 + "números");
				System.out.println("o intervalo 4 teve " + i4 + "números");
				}
		}
}
