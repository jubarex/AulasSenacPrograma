package projetoprojeto;

import java.util.Scanner;

public class mediavetor {

	public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Escreva um valor");
			int tamanho = teclado.nextInt();
			int vetor[] = new int [tamanho];
			int soma = 0;
			
			for(int i = 0; i < tamanho; i++) {
				System.out.println("Diga valores");
				vetor[i] = teclado.nextInt();
				soma = vetor[i];
			}
			System.out.println(soma);
	}

}
