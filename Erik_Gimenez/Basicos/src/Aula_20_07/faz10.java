package Aula_20_07;

import java.util.Scanner;

public class faz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor inteiro");
		int a = sc.nextInt();
		System.out.println("Informe um valor inteiro");
		int b = sc.nextInt();
		System.out.println(faz10(a , b));

	}
	public static boolean faz10(int a, int b) {
		if ((a == 10 || b == 10) || a + b == 10) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
