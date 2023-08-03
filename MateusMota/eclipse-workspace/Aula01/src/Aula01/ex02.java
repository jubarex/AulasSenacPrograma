package Aula01;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Informe o valor");
		 int valor =  teclado.nextInt();
		 if (valor >= 0) {
			 System.out.println("valor positivo");
		 } else {
			 System.out.println("valor negativo");
		 }

	}

}
