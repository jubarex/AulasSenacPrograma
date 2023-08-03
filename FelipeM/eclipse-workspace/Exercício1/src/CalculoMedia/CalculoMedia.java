package CalculoMedia;

import java.util.Scanner;
public class CalculoMedia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("informe um número");
		num1= teclado.nextInt();
		
		System.out.println("informe um número");
		num2= teclado.nextInt();
		
		System.out.println("informe um número");
		num3= teclado.nextInt();
		
		System.out.println((num1 + num2 + num3)/ 3);
	}

}
