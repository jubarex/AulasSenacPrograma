package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor");
		int tamanho = scanner.nextInt();
		int arr[] = new int[tamanho];
		int soma = 0;

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Informe um numero");
			arr[i] = scanner.nextInt();
			soma = arr[i] + soma;
		}
		System.out.println("A soma dos valores do vetor é de " + soma);
			System.out.println(Arrays.toString(arr));
		
	}
}
