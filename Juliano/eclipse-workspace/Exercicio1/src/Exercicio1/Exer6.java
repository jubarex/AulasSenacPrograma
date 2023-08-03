package Exercicio1;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		System.out.println("informe um número");
		valor = teclado.nextInt();
		
		if(valor%2 == 0) {
			System.out.println(valor + " é par!");
		}
		else {
			System.out.println(valor + " é ímpar!");
		}
	}

}
