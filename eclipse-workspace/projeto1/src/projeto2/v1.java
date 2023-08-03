package projeto2;

import java.util.Scanner;

public class v1 {

 

	  public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
	        System.out.println("Digite um valor");
	        float a = teclado.nextFloat();
	        System.out.println("Digite um outro valor");
	        float b = teclado.nextFloat();

	        System.out.println(multi(a,b));
	    }

	  	private static float multi(float a, float b) {
		  if(a == b) {
	  			float rsltd = (a + b) * 2;
		  
	  			return rsltd;
	  		}else {
	  			float rsltd = a + b;
	  		  
	  			return rsltd;
	  		}
	  }  		
}