package Aula_20_07;

import java.util.Scanner;

public class desapareceChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		System.out.println("Qual a posição da letra que deseja apagar");
		int posicao = sc.nextInt();
		System.out.println(desapareceChar(palavra, posicao));

	}

	public static String desapareceChar(String palavra, int posicao) {
		String front = palavra.substring(0, posicao);
		String back = palavra.substring(posicao+1, palavra.length());
		return front + back;
	}
}
