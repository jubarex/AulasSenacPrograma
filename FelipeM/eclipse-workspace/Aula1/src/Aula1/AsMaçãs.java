package Aula1;

import java.util.Scanner;
public class AsMaçãs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas maçãs deseja?");
		int macas = teclado.nextInt();
		
		if (macas<= 11) {
		System.out.println("Sua compra deu: " + (macas * 1.30 ));
		}
		else {
		System.out.println("Sua compra deu: " + (macas * 1));
		}
			
	}

}
