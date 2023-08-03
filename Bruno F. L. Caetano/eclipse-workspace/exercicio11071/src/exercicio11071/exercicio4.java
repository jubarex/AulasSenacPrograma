package exercicio11071;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
    	int num1, num2, num3;
    
    	
		 Scanner Teclado = new Scanner(System.in);
		    System.out.println("Informe um número");
		num1 = Teclado.nextInt();
		   System.out.println("Informe outro número");
		  num2 = Teclado.nextInt();
		  System.out.println("Informe mais um número");
		  num3 = Teclado.nextInt();
				  
		  if(num1 >= num2 && num2 >= num3){
			  System.out.println(num1 + " " + num2 + " " + num3);
		  }
		  
		  else if(num1 >= num3 && num3 >= num2) {
		  System.out.println(num1 + " " + num3 + " " + num2);
		  }
		  
		  else if(num2 >= num1 && num1 >= num3) {
			  System.out.println(num2 + " " + num1 + " " + num3);
			  }
		  else if(num2 >= num3 && num3 >= num1) {
			  System.out.println(num2 + " " + num3 + " " + num1);
			  }
		  else if(num3 >= num1 && num1 >= num2) {
			  System.out.println(num3 + " " + num1 + " " + num2);
			  } 
		  else if(num3 >= num2 && num2 >= num1) {
				  System.out.println(num2 + " " + num2 + " " + num1);
				  }
	}		  
		    
		    
		
		

		
		
		
		
	}
	