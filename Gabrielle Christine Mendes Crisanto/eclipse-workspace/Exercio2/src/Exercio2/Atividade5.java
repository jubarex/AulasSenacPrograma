package Exercio2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
           
		int salario;
double desconto;

		
		System.out.println("Informe o salario");
		 salario= teclado.nextInt();
		 
	 desconto = ( salario * 0.11 ); 
	 
	 if (desconto > 450) {
		 desconto = 450;
		 
	 }
	 System.out.println("valor do desconto:" + desconto);
	 
		
	 
	 
	 
		 
				 
		
		 
		
		

	}

}
