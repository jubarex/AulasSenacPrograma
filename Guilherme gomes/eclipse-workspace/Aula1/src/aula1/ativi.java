package aula1;

import java.util.Scanner;

public class ativi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner teclado = new Scanner(System.in);
         
         double nota1, nota2;
         
         System.out.println("informe a primeira nota");
         nota1 = teclado.nextDouble();
        		 
         System.out.println("informe a segunda nota");
         nota2 = teclado.nextDouble();
         
         double media = (nota1+nota2)/2.0;
         if(media == 10) {
        	   System.out.println("aprovado com distinção");
         }
         else if(media >= 7) {
        	   System.out.println("aprovado");
         }
         else {
        	 System.out.println("Reprovado");
         }
}
}
