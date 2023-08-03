package atividade_1;
import java.util.Scanner;
public class At3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	  double maças;
	  
	  System.out.println("digite a quantidade de maças");
	  maças = teclado.nextDouble();
	  
	  if(maças >= 12) {
		  double resultado = maças * 1.0;
		  System.out.println("O total da compra deu: "+ resultado);
	  } else {
		  double resultado = maças * 1.30;
		  System.out.println("o valor total é: "+ resultado);
	  }
		
		

	}

}
