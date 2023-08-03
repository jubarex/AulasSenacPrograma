package aula1307;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2;
		
		Scanner Teclado = new Scanner (System.in);
		System.out.println("Informe a primeira Nota");
		nota1 = Teclado.nextDouble();
		
		System.out.println("Informe a segunda Nota");
		nota2 = Teclado.nextDouble();
		
		double media = (nota1 + nota2)/2.0;
		
		if (media >= 60) {
			System.out.println(" O aluno foi aprovado com média de " + media);
		}
				
		else {
			System.out.println("O aluno foi reprovado com média de " + media);
		}
		
		
	}

}
