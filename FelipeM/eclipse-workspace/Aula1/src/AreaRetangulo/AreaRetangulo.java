package AreaRetangulo;

import java.util.Scanner;
public class AreaRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe a base");
		int num1 = teclado.nextInt();
		
		System.out.println("informe a altura");
		int num2 = teclado.nextInt();
		
		System.out.println("A Area deste retangulo é de: " + (num1 * num2));
	}

}
