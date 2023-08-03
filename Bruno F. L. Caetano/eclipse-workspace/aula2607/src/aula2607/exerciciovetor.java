package aula2607;

import java.util.Scanner;


public class exerciciovetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanhoVetor = 5;
		int[] nomeVariavel = new int[tamanhoVetor];
		
	//                     4 < 5
	//                    i < tamanhoVetor
		
		for (int i = 0; i <= (tamanhoVetor-1); i++) {
			nomeVariavel[i] = (i+1);
		}
		
		for (int posicao = 0; posicao < nomeVariavel.length; posicao++) {
			System.out.println(nomeVariavel[posicao] + " ");
			
			System.out.println(" ");
			System.out.println();
		}
		
		
		
 
	 
		
		
	}

}
