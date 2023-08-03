package Aula1;

import java.util.Scanner;
public class MediaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		double primeira = teclado.nextDouble();
		
		System.out.println("Informe a segunda nota");
		double segunda = teclado.nextDouble();
		
		double media = (primeira + segunda) /2;
		
		if (media >= 6) {
		System.out.println("A média foi de" + media);
		System.out.println("Aprovado!");
		
		
		}
		else {
		System.out.println("A média foi de " + media);
		System.out.println("Reprovado!");
		}
	}	

}
