package ex01;

import java.util.Scanner;

public class aula05ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Double km , litro,media;
		System.out.println("Quantos km e Quantos litros?");
		km = teclado.nextDouble();
		litro = teclado.nextDouble();
		media = km / litro;
		System.out.println(media);

	}

}
