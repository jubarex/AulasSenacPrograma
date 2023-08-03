package Aula_20_07;

import java.util.Scanner;

public class perigoCaco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean aSorriso, bSorriso;
		System.out.println("O primeiro macaco esta sorrindo?");
		aSorriso = sc.nextBoolean();
		System.out.println("O segundo macaco esta sorrindo?");
		bSorriso = sc.nextBoolean();
		if (perigoCaco(aSorriso , bSorriso) == true) {
			System.out.println("Você esta em perigo");
		}
		else {
			System.out.println("Você esta seguro");
		}

	}

	public static boolean perigoCaco(boolean aSorriso, boolean bSorriso) {
		
		if (aSorriso == true && bSorriso == true) {
			return true;
		}
		else if ((aSorriso == true && bSorriso == false) || (aSorriso == false && bSorriso == false)) {
			return false;
		}
		else {
			return true;
		}
	}
}
