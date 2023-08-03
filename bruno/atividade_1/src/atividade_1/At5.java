package atividade_1;
import java.util.Scanner;
public class At5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double salario, desconto = 0.11;
		
		System.out.println("Infome o seu salario");
		salario = teclado.nextDouble();
			double valorDesconto = salario * desconto; 	
		if(valorDesconto >= 450) {
			System.out.println("O valor do desconto foi de: "+ 450);
		} else {
			System.out.println("O valor do desconto foi de: "+ valorDesconto); 
		}

	}

}
