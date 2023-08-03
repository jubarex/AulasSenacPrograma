package Aula1;

import java.util.Scanner;
public class comissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o salário");
		
		double salario = teclado.nextDouble();
		
		System.out.println("Informe o valor das vendas");
		
		double vendas = teclado.nextDouble();
		
		if (vendas <=1500) {
		double comissao = vendas * 0.03;
		System.out.println("O salário total foi de: " + (salario + comissao));
		}
		else {
		double comissao = 1500 * 0.03;
		comissao = comissao + (vendas - 1500) * 0.05;
		System.out.println("O salário total foi de: " + (salario + comissao));
		}
	}

}
