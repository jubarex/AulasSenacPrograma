package exerc1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner teclado = new Scanner(System.in);

//		boolean entradaUM = teclado.nextBoolean();
//		boolean entradaDOIS = teclado.nextBoolean();

		System.out.println(perigoCACO(true, true));// true
		System.out.println(perigoCACO(false, false));// true
		System.out.println(perigoCACO(false, true));// false
	}

	public static boolean perigoCACO(boolean aSORRISO, boolean bSORRISO) {
		if (aSORRISO == true && bSORRISO == true) {
			return true;
		} else if (aSORRISO == false && bSORRISO == false) {
			return true;
		} else {
			return true;
		}
	}
}

