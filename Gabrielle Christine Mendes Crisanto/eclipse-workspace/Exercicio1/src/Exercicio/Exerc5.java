package Exercicio;

import java.util.Scanner;
public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota1, nota2, nota3;
		
		
		System.out.println("Informe a primeira nota");
		nota1 = teclado.nextDouble();
		System.out.println("Informe a segunda nota");
		nota2 = teclado.nextDouble();
		System.out.println("Informe a terceira nota");
		nota3 = teclado.nextDouble();
		
		double média =(nota1 + nota2 + nota3)/3.0;
		System.out.println("média: "+ média);
		

	}

}
