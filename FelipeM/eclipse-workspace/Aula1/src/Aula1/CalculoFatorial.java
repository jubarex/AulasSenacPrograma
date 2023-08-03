package Aula1;

import java.util.Scanner;
public class CalculoFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int numero = teclado.nextInt();
		int valor = numero - 1;
		
		for ( int i = valor-1; i > 0; i--) {
		numero = numero * valor;
		valor -= 1;
				
		}
		System.out.println("O resultado é: " + numero);
	}

}
