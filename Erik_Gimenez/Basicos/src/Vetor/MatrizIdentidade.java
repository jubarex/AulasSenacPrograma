package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizIdentidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a ordem da matriz");
		int ordem = scanner.nextInt();
		int arr[][] = new int[ordem][ordem];

		for (int i = 0; i < ordem; i++) {
			for (int ii = 0; ii < ordem; ii++) {
				if (ii == i) {
					arr[i][ii] = 1;
				} else {
					arr[i][ii] = 0;
				}
			}

		}
		for (int i = 0; i < ordem; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
