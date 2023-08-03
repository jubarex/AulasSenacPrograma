package projeto1;

import java.util.Scanner;

public class p5 {


	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		//1
		int a, b, c;
		System.out.println("Quantos litros você gastou?");
		a = teclado.nextInt();
		
System.out.println("Quantos km você andou?");
		b = teclado.nextInt();
		
		System.out.println("Você gastou em média " + b/a);
		
		//2
		//do-while = (repita até que)
		
		int par = 0, impar = 0;
		c = -1;
		while(c != 0){
			System.out.println("Diga um valor");
			c = teclado.nextInt();
		if(c %2 == 0){
		par = c + par;
	} else {
		impar = c + impar;
	}
	}System.out.println("pares igual a:" + par + " impares igual a: " + impar);
	
		//3
	int d = 0, e = 2;
		System.out.println("Diga um valor");
		d = teclado.nextInt();
		e = d;
		
		while(e == 1) {
			System.out.println(d * (e - 1));
		}
	}
}
