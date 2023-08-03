package ex01;

import java.util.Scanner;

public class aula3ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		int anos , meses , dias ;
		System.out.println("Quantos anos vc tem , meses e dias");
	    anos =  teclado.nextInt();
		meses =  teclado.nextInt();
		dias =  teclado.nextInt();
		int idadeEmDias = anos * 365 + meses * 30 + dias;
		System.out.println(idadeEmDias + " dias");
		
		
		
		
		
		
	}

}
