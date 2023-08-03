package aulaAula;

import java.util.Scanner;

public class aulasenac2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O macacco A esta sorrindo ? True or False");
		boolean entradaUm = teclado.nextBoolean();
		
		System.out.println("O macaco B está sorrindo ? True or False");
		boolean entradaDois = teclado.nextBoolean();
	    
		System.out.println("O macaco é perigoso");
		System.out.println(perigocaco(entradaUm , entradaDois)); // usauario decide
	}

	
	public static boolean perigocaco(boolean aSorriso , boolean bSorriso) {
		if (aSorriso == true && bSorriso == true) {
		return true;
	} else if (aSorriso == false && bSorriso == false ) {
		return true;
	} else {
		return false;
	}
	}
}
