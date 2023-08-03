package aula;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double base, altura;
		
		System.out.println("informe a base");
		base = teclado.nextDouble();
		System.out.println("informe a altura");
		altura = teclado.nextDouble();
		
		double area = base * altura;
		System.out.println("área do retângulo: "+ area);
	}

}
