package ex01;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Informe um número inteiro!");
		numero=teclado.nextInt();
		if (numero % 2 == 0){
			System.out.println("é par");
		}
		else { System.out.println("é ímpar");}

	}

}
