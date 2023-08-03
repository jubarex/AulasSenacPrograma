package ex01;

import java.util.Scanner;

public class aula05ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//o WHILE  representa a estrutura de repetição !!!!!!!!!!!
		Scanner teclado = new Scanner(System.in);
	    int valor = -1 , somaPar = 0,somaImpar = 0;
		while (valor != 0 ) {
			System.out.println("informe um número");
		valor = teclado.nextInt();
		if (valor%2 ==  0) {
			somaPar += valor;
			
		}
		else {
			somaImpar += valor;
		}
		}
		System.out.println(somaPar);
		System.out.println(somaImpar);
		
		

	}

}
