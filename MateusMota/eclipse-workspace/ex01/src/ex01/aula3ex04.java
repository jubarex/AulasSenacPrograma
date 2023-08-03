package ex01;

import java.util.Scanner;

public class aula3ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Double nota1,nota2, media;
		System.out.println("Primeira notae segunda nota!");
		nota1= teclado.nextDouble();
		nota2= teclado.nextDouble();
		media = (nota1+nota2)/2;
		System.out.println("media final" + media);
		if (media > 6)
			System.out.println("Aprovado");
		else System.out.println("Reprovado");

	}

}
