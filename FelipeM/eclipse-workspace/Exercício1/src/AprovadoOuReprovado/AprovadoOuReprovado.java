package AprovadoOuReprovado;

import java.util.Scanner;
public class AprovadoOuReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe a primeira nota");
		double num1 = teclado.nextDouble();
				
		System.out.println("informe a segunda nota");
		double num2 = teclado.nextDouble();
		
		double media = (num1+num2)/2.0;
		if(media == 10) {
		System.out.println("Aprovado com distinção!");
		}
		else if(media >= 7) {
		System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
	}

}
