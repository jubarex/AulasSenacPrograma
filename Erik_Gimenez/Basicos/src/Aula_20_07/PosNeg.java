package Aula_20_07;

import java.util.Scanner;

public class PosNeg {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe um valor inteiro");
			int a = sc.nextInt();
			System.out.println("Informe um valor inteiro");
			int b = sc.nextInt();
			System.out.println("Parametro negativo = ");
			boolean negativo = sc.nextBoolean();
			System.out.println(PosNeg(a , b , negativo));

		}
		public static boolean PosNeg(int a, int b, boolean negativo) {
			if (negativo == false) {
				if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if ((a < 0 && b < 0)) {
					return true;
				}
				else {
					return false;
				}
			}


			
		}
	}
