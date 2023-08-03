package aula2107;

import java.util.Scanner;

public class exerciciothrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		try {
			numero();
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
	
		
		System.out.println("Continuou com mesmo erro");
		
		
		
	
		
		
	}

	
	public static void numero() throws Exception { 
		
		Scanner Teclado = new Scanner (System.in);
	System.out.println("Informe qualquer número"); 
    int numero = Teclado.nextInt();
	
    if (numero < 0 ) {
    	  throw new Exception ("número invalido");
    }
    
     
     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
