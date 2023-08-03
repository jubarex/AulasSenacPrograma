package aula1307;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Teclado = new Scanner (System.in);
		
	double qtdm, valor;
	
	System.out.println("Quantas maças você vai querer?");
		qtdm = Teclado.nextDouble();
	
	if (qtdm >= 12) {
		valor = qtdm * 1.0;
		}
	
	else {
		valor = qtdm * 1.3;
	}
	           
	System.out.println("O valor total é de " + valor);
	
	
	
	}

}
