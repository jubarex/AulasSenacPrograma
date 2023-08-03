package Aula1;

import java.util.Scanner;

public class mediaparesegeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int valor = 1;
		int impar = 0;
		int par = 0;
		int mediapar = 0;
		int geral = 0;
		int mediageral = 0;

		while (valor != 0) {
			System.out.println("Informe um valor");
			valor = teclado.nextInt();

			geral = valor + geral;
			mediageral++;

			if (valor % 2 == 0) {
				par = valor + par;
				mediapar++;
			} else {
				impar++;
			}
		}

		System.out.println("A quantidade de pares foi de: " + mediapar);

		System.out.println("A quantidade de pares foi de: " + impar);

		System.out.println("A média dos pares foi de: " + (par / mediapar));

		System.out.println("A média geral foi de: " + (geral / mediageral));
	}

}
