package Exercicio;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int valor;
		System.out.println("Informe um número");
		valor = teclado.nextInt();
		
		if(valor%2 == 0) {
			System.out.println(valor + " é par");
		}
		else {
			System.out.println(valor + " é impar");
		}
				

	}

}
