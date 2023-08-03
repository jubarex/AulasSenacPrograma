package DiasDeVida;

import java.util.Scanner;
public class DiasDeVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe quantos anos");
		int anos = teclado.nextInt();
		
		System.out.println("informe quantos meses");
		int meses = teclado.nextInt();
		
		System.out.println("informe quantos dias");
		int dias = teclado.nextInt();
		
		System.out.println("Em dias corrresponde a: " + (anos * 365 + meses * 30 +dias));
	
	}

}
