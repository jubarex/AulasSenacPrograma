package Aula1;

public class perigoCaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(perigoCaco(true, true));// true
		System.out.println(perigoCaco(false, false));// true
		System.out.println(perigoCaco(true, false));// false
	}

	public static boolean perigoCaco(boolean aSorriso, boolean bSorriso) {

		if (aSorriso == true && bSorriso == true) {
			return true;
		} else if (aSorriso == false && bSorriso == false) {
			return true;

		} else {
			return false;
		}
	}

}
