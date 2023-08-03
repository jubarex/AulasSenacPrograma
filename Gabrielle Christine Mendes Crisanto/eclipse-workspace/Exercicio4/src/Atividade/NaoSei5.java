package Atividade;

import java.util.Scanner;

public class NaoSei5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[10][10];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = linha * coluna;
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.println(matriz[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
	}

}
