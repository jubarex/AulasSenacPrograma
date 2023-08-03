package aula2007;

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner Teclado = new Scanner (System.in);
		
//		int n1, n2;
//		System.out.println("Informe um valor inteiro");
//	    int n1 = Teclado.nextInt();
	 
		 System.out.println(somar(100, 2));
		System.out.println(subtrair(564, 1));
	    System.out.println(multiplicar(345, 3));
	    System.out.println(dividir(300, 2));
	  
	
	    
	   
	    
	  
	
	
	}
	
	
	
	
	private static float somar(float num1, float num2) {
		float resultado = num1 + num2;
		
		
		return resultado;
	
	}
	
	private static float subtrair(float num1, float num2) {
    float resultado = num1 - num2;
    
    return resultado;
    
    
	}
	
	private static float multiplicar(float num1, float num2) {
		float resultado = num1 * num2;
		
		return resultado;
		
	}
	
	private static float dividir(float num1, float num2) {
		float resultado = num1 / num2;
		
		return resultado;
		
	}
	
	
}
	
