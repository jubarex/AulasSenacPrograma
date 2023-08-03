package atividade_1;
import java.util.Scanner;
public class At4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2;
		
		System.out.println("digite a sua primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		
		double total = (nota1 + nota2) / 2;
		
		if(total >= 6) {
			System.out.println("Aluno aprovado: "+ total);
			
		}else {
			System.out.println("aluno reprovado: "+ total);
		}
		

	}

}
