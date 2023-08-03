package Aula1;

import java.util.Scanner;

public class Voupracasaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double nt1 = teclado.nextInt();
		
		System.out.println("Informe a segunda nota");
		double nt2 = teclado.nextInt();
		
		double soma = nt1 + nt2;
		double media = soma /2;
		
		if (media <=5) {
		System.out.println("reprovado, sua media foi de: " + media);	
		}
		else 
		System.out.println("aprovado, sua media foi de: " + media);
		
	}

}
