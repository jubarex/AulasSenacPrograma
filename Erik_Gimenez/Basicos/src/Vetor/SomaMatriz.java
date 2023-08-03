package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class SomaMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a ordem da matriz");
		int ordem = scanner.nextInt();
		int arr1[][] = new int[ordem][ordem];

		for (int i = 0; i < ordem; i++) {
			for (int ii = 0; ii < ordem; ii++) {
				arr1[i][ii] = scanner.nextInt();
			}
		}

		System.out.println("Matriz 1: ");
		for (int i = 0; i < ordem; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

		int arr2[][] = new int[ordem][ordem];

		for (int i = 0; i < ordem; i++) {
			for (int ii = 0; ii < ordem; ii++) {
				arr2[i][ii] = scanner.nextInt();
			}
		}

		System.out.println("Matriz 2: ");
		for (int i = 0; i < ordem; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}

		int soma[][] = new int[ordem][ordem];
		for (int i = 0; i < ordem; i++) {
			for (int ii = 0; ii < ordem; ii++) {
				soma[i][ii] = arr1[i][ii] + arr2[i][ii];
			}
		}
		System.out.println("\nMatriz soma: ");
		for (int i = 0; i < ordem; i++) {
			System.out.println(Arrays.toString(soma[i]));
		}

	}
}
