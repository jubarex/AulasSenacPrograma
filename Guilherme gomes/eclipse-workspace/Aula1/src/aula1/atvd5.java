package aula1;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner (System.in);
        double salario, desconto;
        
        System.out.println("informe o salário");
        salario = teclado.nextDouble();
        desconto = salario * 0.11;
        if(desconto > 450) {
        	desconto = 450;
        }
	System.out.println("valor de desconto: "+ desconto);
      
	}
}
