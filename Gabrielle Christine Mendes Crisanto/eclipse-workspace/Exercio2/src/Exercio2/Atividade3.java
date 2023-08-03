package Exercio2;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int Macas;
		double valor;
		System.out.println("Informe quantas Maças");
		Macas = teclado.nextInt();
		
		if (Macas >=12) {
			valor = Macas *1.0;
		}
		else {
			valor = Macas * 1.3;
		}
		System.out.println("valor total:" + valor);
		
		
		
		

	}

}
