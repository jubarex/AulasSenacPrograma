package Aula_20_07;

import java.util.Scanner;

public class diff21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor inteiro");
		int a = sc.nextInt();
		System.out.println("A diferença entre o numero 21 e " +a+ " é de: " +(diff21(a)));

	}
	public static int diff21(int a) {
		if (a > 21) {
			return (a - 21);
		}
		else {
			return (21 - a);
		}
		
	}

}
