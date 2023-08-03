package ex01;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		double nota1 ,nota2;
		System.out.println("Informe a primeira nota");
		nota1=teclado.nextDouble();
		
		System.out.println("Informe a segunda nota");
		nota2=teclado.nextDouble();
		
		double media = (nota1+ nota2)/2.0;
		if(media == 10) {
			System.out.println("Aprovado com distinção");
		}
		else if (media >= 7 ) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}

	}

}
