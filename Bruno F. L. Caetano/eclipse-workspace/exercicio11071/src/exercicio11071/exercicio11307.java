package exercicio11071;

import java.util.Scanner;

public class exercicio11307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Teclado = new Scanner (System.in);
		System.out.println("Informe a base do retângulo");
        double base = Teclado.nextInt();
        
        System.out.println("Informe a altura do retângulo");
        double alt = Teclado.nextInt();
		
		double área; 
		
		área = (base * alt);
		
		System.out.println(" A área do retângulo é de " + área);
		
		
		
	}
	
	
}