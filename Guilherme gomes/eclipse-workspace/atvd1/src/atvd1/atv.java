package atvd1;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class atv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner teclado = new Scanner(System.in);
		// o While representa a estrutura de repetição (Repita até que
	  int valor = -1, somaPar = 0, somaImpar = 0;
	   while(valor !=0) {
		    System.out.println("informe um número");
		    valor = teclado.nextInt(); 
		    
		    if(valor%2 == 0) {
		    	//somaPar = somaPar = valor;
		    	somaPar += valor;
		    }
		    else {
		    	somaImpar += valor;
		    }
	   }
	    System.out.println("soma total pares: "+somaPar);
	    System.out.println("soma total ímpares: "+somaImpar);
		  

}
}