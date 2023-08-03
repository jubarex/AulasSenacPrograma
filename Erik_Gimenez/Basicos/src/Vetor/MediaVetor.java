package Vetor;

import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor");
		int tamanho = scanner.nextInt();
		double arr[] = new double[tamanho];
		int i = 0;
		double media = 0;

		for (i = 0; i < tamanho; i++) {
			System.out.println("Informe um numero");
			arr[i] = scanner.nextDouble();
			media = arr[i] + media;
		}
		System.out.println("A media dos valores do vetor é de " + (media / tamanho));
	}

}
