package aulaAula;

import java.util.Scanner;

public class somaDobro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    
//    Scanner teclado = new Scanner(System.in);
//    System.out.println("Informe os dois valores ");
//    float num1 = teclado.nextFloat();
//    float num2 = teclado.nextFloat();
//    float somara = num1 + num2;
		
    System.out.println(   somar(2, 3) + " / " + subtrai(2,3) + " / " + multiplicar(2,3) + " / " + dividir(2,3));
    System.out.println(   somar(4, 8) + " / " + subtrai(4,8) + " / " + multiplicar(4,8) + " / " + dividir(4,8));
    System.out.println(   somar(7, 10) + " / " + subtrai(7,10) + " / " + multiplicar(7,10) + " / " + dividir(7,10));
    
    
	}
	
	private static float somar (float num1 , float num2 ) {
		float somar = num1 + num2;
		return somar;
	}
	private static float subtrai (float num1 , float num2 ) {
		float subtrai = num1 - num2;
		return subtrai;		
	}
	private static float multiplicar (float num1 , float num2) {
		float multiplicar = num1 * num2 ;
		return multiplicar ;
	}
	private static float dividir (float num1 , float num2 ) {
		float dividir = num1 / num2 ;
		return dividir ;
	}
	
}

 
