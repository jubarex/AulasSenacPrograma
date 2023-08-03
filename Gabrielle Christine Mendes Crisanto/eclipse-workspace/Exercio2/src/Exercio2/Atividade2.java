package Exercio2;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int Anos, Meses, Dias;
		System.out.println("Informe a Anos");
		Anos = teclado.nextInt();
		
		System.out.println("Informe a Meses");
		Meses = teclado.nextInt();
		
		System.out.println("Informe a Dias");
		Dias = teclado.nextInt();
		
		int diastotais = (Anos * 365) + (Meses * 30) + Dias;
		System.out.println("o total de dias:" + diastotais);
		
		
		
		
	}

	
}
