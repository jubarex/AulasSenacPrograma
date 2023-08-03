package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizEscalar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe quantas linhas a matriz tem");
		int linhas = scanner.nextInt();
		System.out.println("Informe quantas colunas a matriz tem");
		int colunas = scanner.nextInt();
		float arr[][] = new float[linhas][colunas];

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
		System.out.println("\nDigite o valor que deseja usar para multiplicar a matriz");
		float multi = scanner.nextFloat();
		for (int i = 0; i < linhas; i++) {
			for (int ii = 0; ii < colunas; ii++) {
				arr[i][ii] = arr[i][ii] * multi;

			}
		}
		System.out.println("Matriz transposta: ");
		for (int i = 0; i < colunas; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
