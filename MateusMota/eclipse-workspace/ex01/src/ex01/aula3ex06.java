package ex01;

import java.util.Scanner;

public class aula3ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Double salario, vendas , comissao ;
		System.out.println("Qual salário");
		salario = teclado.nextDouble();
		vendas = teclado.nextDouble();
		if(vendas <= 1500) {
			comissao = vendas * 0.03;
		}
		else {
			comissao = 1500 * 0.03;
			comissao = comissao + (vendas - 1500)*0.05;
		}
		System.out.println("salário final "+ (salario+comissao));
		
		
		

	}

}
