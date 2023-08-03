package Aula_20_07;

import java.util.Scanner;

public class somaDobro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b ;
		System.out.println("Digite um numero");
		a = sc.nextInt();
		System.out.println("Digite um numero");
		b = sc.nextInt();
		System.out.println(somaDobro(a, b));
		

	}
	public static int somaDobro(int a, int b) {
		if ( a == b) {
			return ((a + b) * 2);
		}
		else {
			return (a + b);
		}
		
	}

}
