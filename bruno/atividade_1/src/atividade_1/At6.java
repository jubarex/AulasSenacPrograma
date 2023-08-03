package atividade_1;
import java.util.Scanner;
public class At6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double salario, vendas;
		
		System.out.println("Informe seu salario");
		salario = teclado.nextDouble();
		System.out.println("Total de vendas");
		vendas = teclado.nextDouble();
	  if(vendas >= 1500) {
		  double comiçao = (1500 * 0.03) + ((vendas - 1500) * 0.05);
		  System.out.println("O total foi de: "+ (salario + comiçao));
	  } else {
		  double comiçao = vendas * 0.03;
		  System.out.println("O total foi de: "+ (salario + comiçao));
	  }
	  
	  

	}

}
