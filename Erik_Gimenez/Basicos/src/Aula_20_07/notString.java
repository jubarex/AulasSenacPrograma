package Aula_20_07;

import java.util.Scanner;

public class notString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		System.out.println(notString(palavra));
		
		}
	
	public static String notString(String palavra) {
		if (palavra.length() >=3 && palavra.substring(0 , 3).equals("not")) {
			return palavra;
		}
		else {
			return "Not " + palavra;
		}

	}

}
