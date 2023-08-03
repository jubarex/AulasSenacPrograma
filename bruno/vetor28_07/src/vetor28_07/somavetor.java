package vetor28_07;

import java.util.Arrays;
import java.util.Scanner;

public class somavetor {
	 
	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Escreva um valor");
	        int tamanho = teclado.nextInt();
	        double vetor[] = new double [tamanho];
	        double soma = 0;
	        double media;
	        for(int i = 0; i < tamanho; i++) {
	            System.out.println("Diga valores");
	            vetor[i] = teclado.nextDouble();
	            soma = soma + vetor[i];
	        }
	        media = soma;
	        System.out.println(media);
	        System.out.println(Arrays.toString(vetor));
	    }
}
