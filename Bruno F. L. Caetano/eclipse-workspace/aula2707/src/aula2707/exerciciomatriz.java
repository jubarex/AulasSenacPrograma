package aula2707;

import java.util.Arrays;

public class exerciciomatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//vetor de vetores do tipo int
		int[][] matriz = new int[3][3];
       
		//vetor de vetores int ja com os valores
		int[][] matrizNumeros = { 
				                  {1, 2, 3}, 
				                  {4, 5, 6},
				                  {7, 8, 9}
	                            	};
		
	
		//
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");

		}

		int soma = 0;
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros.length; j++) {
				soma += matrizNumeros[i][j];
				
			}
		}

		System.out.println("A soma dos valores é " + soma);

	}

}
