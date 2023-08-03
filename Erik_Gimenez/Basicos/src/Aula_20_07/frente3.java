package Aula_20_07;

import java.util.Scanner;

public class frente3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		System.out.println(frente3(palavra));
	
		}

	public static String frente3(String palavra) {
		palavra = palavra.replace(palavra.substring(3), "");
		return palavra+palavra+palavra;
	}
	}

