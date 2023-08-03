package aula;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// o While representa a estrutura de repetição (Repita até que) no Scratch
		int valor = -1, somaPar = 0, somaImpar = 0; 
		while(valor != 0) {
			System.out.println("informe um número");
			valor = teclado.nextInt();
			
			if(valor%2 == 0) {
				//somaPar = somaPar + valor; 
				somaPar += valor;
			}
			else {
				somaImpar += valor;
			}
		}
		System.out.println("Soma total pares: "+somaPar);
		System.out.println("Soma total ímpares: "+somaImpar);
	}

}
