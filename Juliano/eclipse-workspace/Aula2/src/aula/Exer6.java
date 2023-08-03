package aula;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double salario, vendas, comissao;
		
		System.out.println("informe o salário");
		salario = teclado.nextDouble();
		
		System.out.println("informe o valor de vendas");
		vendas = teclado.nextDouble();
		if(vendas <= 1500) {
			comissao = vendas * 0.03;
		}
		else {
			comissao = 1500 * 0.03;
			comissao = comissao + (vendas - 1500) * 0.05;
		}
		System.out.println("salário total: "+ (salario + comissao));
	}

}
