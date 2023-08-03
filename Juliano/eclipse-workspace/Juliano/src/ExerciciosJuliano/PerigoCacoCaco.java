package ExerciciosJuliano;

import java.util.Scanner;

public class PerigoCacoCaco {

	public static void main(String[] args) {
	
//		Scanner teclado = new Scanner(System.in);
	
//		System.out.println("O macaco A está sorrindo? True ou False");
//		boolean entradaUm = teclado.nextBoolean();
		
//		System.out.println("O macaco B está sorrindo? True ou False");
//		boolean entradaDois = teclado.nextBoolean();
		
//		System.out.print("O macaco é perigoso: ");
//		System.out.print(perigoCaco(entradaUm, entradaDois)); // usuario decide
		
		
//		System.out.println(perigoCaco(true, true)); // true
//		System.out.println(perigoCaco(true, false)); // false
//		System.out.println(perigoCaco(false, true)); // false
//		System.out.println(perigoCaco(false, false)); // true
		
//		somar(5,5);
//		multiplicar(5,5);
//		dividir(10, 2);
//		subtrair(6,3);
		float valor1 = 30;
		float valor2 = 5;
		
		
		
		float arroz = multiplicar(somar(valor1,valor2),subtrair(valor1,valor2));
		System.out.println("Preço do arroz: R$ "+arroz);
//		Scanner teclado = new Scanner(System.in);
//		valor1 = teclado.nextFloat();
//		valor2 = teclado.nextFloat();
		
//		float arroz = multiplicar(valor1, valor2);
//		System.out.println("Preço do arroz: R$ "+arroz);
//		System.out.println("----");
//		System.out.println(somar(valor1, valor2));
//		System.out.println(subtrair(valor1, valor2));
//		System.out.println(dividir(valor1, valor2));
		
		
		calculamentos("mensagem em texto testando");
	}
	
	private static void calculamentos(String mensagem) {
		System.out.println(mensagem);
	}
	
	
	private static float subtrair(float num1, float num2) {
		return num1 - num2;
	}

	private static float dividir(float num1, float num2) {
		return num1 / num2;
	}

	private static float multiplicar(float num1, float num2) {

		return num1 * num2;
	}

	private static float somar(float num1, float num2) {
	 return num1 + num2;	
	}

	public static boolean perigoCaco(boolean aSorriso, boolean bSorriso) {
		if (aSorriso == true && bSorriso == true) {
			return true;
		} else if (aSorriso == false && bSorriso == false) {
			return true;
		} else {
			return false;
		}
	}

}
