package atividade_1;
import java.util.Scanner;

public class At1 {
	public static void main(String[]args) {
	 Scanner teclado = new Scanner(System.in);	
	double altura, largura;
	
		 System.out.println("digite a altura");
          altura = teclado.nextDouble();
		 
		 
		 System.out.println("digite a largura");
		 largura = teclado.nextDouble();
		 
		 double area = altura * largura;
		 System.out.println("área do retangulo: "+ area);
		 

	}

}
