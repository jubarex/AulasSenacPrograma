package ex01;

import java.util.Scanner;

public class ex01 {
public static void main(String[ ] args) {
	 //TODO Auto-generated method stub 
	
	//informe dois números e informarei o maior
	
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o primeiro valor");
    int valor1 = teclado.nextInt();
    
    System.out.println("Informe o segundo valor");
    int valor2 = teclado.nextInt();
    
    if ( valor1 >= valor2 ) { 
     System.out.println( valor1 + " é o maior valor maior");
    } else {
   	 System.out.println(valor2 + " é o maior valor");
    }
    
    
	 
  
   }


}
