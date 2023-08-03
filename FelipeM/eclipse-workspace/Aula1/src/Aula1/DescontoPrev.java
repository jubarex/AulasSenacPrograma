package Aula1;

import java.util.Scanner;
public class DescontoPrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o salário");
		
		double salario = teclado.nextDouble();
		
		double desconto = (salario * 0.11);
		
		if (desconto >= 450) {
			desconto = 450;
		}
		System.out.println("O desconto é de:" + desconto);
	}

}
