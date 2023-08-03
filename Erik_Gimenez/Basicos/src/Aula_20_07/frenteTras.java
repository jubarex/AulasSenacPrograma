package Aula_20_07;

import java.util.Scanner;

public class frenteTras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		System.out.println(frenteTras(palavra));
	
		}

	public static String frenteTras(String palavra) {
	    StringBuilder contrario = new StringBuilder();
		for (int i = palavra.length() - 1; i >= 0; i--) {
			contrario.append(palavra.charAt(i));
			System.out.println(contrario.toString());
		}
		return contrario.toString();

	}
	}


