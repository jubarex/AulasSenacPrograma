package exerc1;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
//		boolean entradaUM = teclado.nextBoolean();
//		boolean entradaDOIS = teclado.nextBoolean();
		System.out.println("Mensagem: "+Somar(2, Subtrair(5,7)));
		System.out.println(Somar(6, 3));
		System.out.println(Subtrair(4, 8));
		System.out.println(Multiplicar(4, 8));
		System.out.println(Dividir(4, 8));

	}

	public static float Somar(float num1, float num2) {
		float Abacate = num1 + num2;
		return Abacate;

	}

	public static float Subtrair(float num1, float num2) {
		float Laranja = num1 - num2;
		return Laranja;
	}

	public static float Multiplicar(float num1, float num2) {
		float Uva = num1 * num2;
		return Uva;
	}
	public static float Dividir(float num1, float num2) {
		float Uva = num1 / num2;
		return Uva;
	}
}
