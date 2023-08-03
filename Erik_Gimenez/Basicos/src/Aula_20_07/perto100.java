package Aula_20_07;

import java.util.Scanner;

public class perto100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor inteiro");
		int a = sc.nextInt();

		if (perto100(a) == true) {
			if (a <= 100 + 10 && a >= 100 - 10) {
				System.out.println("O numero " + a + " esta perto de 100");
			} else if (a <= 200 + 10 && a >= 200 - 10) {
				System.out.println("O numero " + a + " esta perto de 200");
			}
		} else {
			System.out.println("O numero não esta perto de 100 nem 200");
		}
	}

	public static boolean perto100(int a) {
		if ((Math.abs(100 - a) <= 10) || (Math.abs(200 - a)) <= 10) {
			return true;
		}
		else {
			return false;
		}

	}
}
