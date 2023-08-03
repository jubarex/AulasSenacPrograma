package Exercio2;

import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double salario,vendas,comissao;
		
		System.out.println("informe o salário");
		salario = teclado.nextDouble();
		
		System.out.println("informe o valor da vendas");
		vendas = teclado.nextDouble();
		
		if (vendas <=1500) {
			comissao = vendas * 0.3;
		}
		else {
			comissao = 1500 * 0.3;
			comissao = comissao + (vendas -15000) * 0.05;
		}
		
		System.out.println("Salário total:" + (salario+comissao));
		
		
		
		

	}

}
