package ImparOuPar;

import java.util.Scanner;
public class ImparOuPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1;
		
		System.out.println("informe um número");
		num1= teclado.nextInt();
		
		if(num1%2 == 0) {
		System.out.println("É par");
		}
		else {
		System.out.println("É impar");
		}
		

	}

}
