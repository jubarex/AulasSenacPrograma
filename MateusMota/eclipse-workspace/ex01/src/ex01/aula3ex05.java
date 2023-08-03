package ex01;

import java.util.Scanner;

public class aula3ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Double salario , desconto;
		System.out.println("Qual sálario ");
		salario = teclado.nextDouble();
		desconto = salario * 0.11 ;
		if(desconto >450) {
			desconto =  450.0 ;
			
		}
			System.out.println("valor de desconto "+ desconto);
		

	}

}
