package aula2007;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(perigoCaco(false, false));
	
		
		
	    Scanner Teclado = new Scanner (System.in);
		System.out.println("O macaco está sorrindo para você? true or false");
	    boolean entradaUm = Teclado.nextBoolean();
		
	    
	    System.out.println("O Outro macaco está sorrindo?");
	    boolean entradaDois = Teclado.nextBoolean();
			
        System.out.println(perigoCaco(entradaUm, entradaDois));
        
		
//		System.out.println(perigoCaco(true, true)); // true	
//		System.out.println(perigoCaco(true, false)); // false
//		System.out.println(perigoCaco(false, true)); // false
//		System.out.println(perigoCaco(false, false)); //true
		
		
	
		
	}

	
	public static boolean perigoCaco(boolean aSorriso, boolean bSorriso) {
		
		if (aSorriso == true && bSorriso == true) {
		return true; 
		} 
		
		else if (aSorriso == false && bSorriso == false) {
			return true; 
					}
		else {
			return false;
		}
		
	}
	
	
	
}
