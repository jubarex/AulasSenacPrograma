package aula2107;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Teclado = new Scanner (System.in);
		System.out.println("Informe dois valores inteiros");
	   int num1 = Teclado.nextInt();
	   System.out.println("Informe o segundo valor");
	   int num2 = Teclado.nextInt();
	   
	   System.out.println(somar(num1, num2));
	;
		
	}

	public static int somar(int num1, int num2) { 
		int resultado = num1 + num2;
		
		
		if (num1 == num2) {  resultado = (num1 + num2) * 2;} 
		
		else { resultado = num1 + num2;}
		
		
		return resultado;
		

		
	}
	
	
	
	
}
