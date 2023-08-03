package aula1307;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner Teclado = new Scanner(System.in);
		  double salario, comissao, vendas;
		  
		  System.out.println("Informe o salario");
		salario = Teclado.nextDouble();
		
		System.out.println("Informe o valor das vendas");
		vendas = Teclado.nextDouble();
		
		if(vendas <= 1500) {
			comissao = vendas * 0.03;
					
		}
		
		else {
			comissao = 1500 * 0.03;
			comissao = comissao + (vendas - 1500) * 0.05;
		}
		
		System.out.println("Salario final: " + (salario + comissao));
		
		
		
	}

}
