package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizTransposta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe quantas linhas a matriz tem");
		int linhas = scanner.nextInt();
		System.out.println("Informe quantas colunas a matriz tem");
		int colunas = scanner.nextInt();
		int arr[][] = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int ii = 0; ii < colunas; ii++) {
				System.out.println("Digite um numero");
				arr[i][ii] = scanner.nextInt();

			}
		}
		System.out.println("Matriz original: ");
		for (int i = 0; i < linhas; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int arrTransp[][] = new int[colunas][linhas];
		for (int i = 0; i < linhas; i++) {
			for (int ii = 0; ii < colunas; ii++) {
				arrTransp[ii][i] = arr[i][ii];

			}
		}
		System.out.println("Matriz transposta: ");
		for (int i = 0; i < colunas; i++) {
			System.out.println(Arrays.toString(arrTransp[i]));
		}

	}

}
