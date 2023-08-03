package aula1307;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Teclado = new Scanner (System.in);
	
int n1, n2, n3;
        
        System.out.println("Informe sua idade");
        n1= Teclado.nextInt();
 
        System.out.println("Informe o Mês em número");
        n2 = Teclado.nextInt();
	
		System.out.println("Informe o dia em que você nasceu"); 
		n3 = Teclado.nextInt();
		
		int dias = (n1 * 365) + (n2 * 30) + n3;
		
		
		System.out.println("Sua idade é " + dias);
		
		
		
		
		
		
	}

}
