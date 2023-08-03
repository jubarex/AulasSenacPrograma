package exercicio11071;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		 Scanner Teclado = new Scanner(System.in);
		System.out.println("Informe um valor e o programa dirá se ele é positivo ou negativo");
		    int numeropon = Teclado.nextInt();
	    
		    if (numeropon > 0) {
		    	System.out.println("O número é positivo: " +numeropon);
		    }
		    
		    
		    if (numeropon < 0) {
		 	  System.out.println("O número é negativo: " +numeropon); 
		    	
		    }
		    	
		    }
		    
	}

