package Aula01;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//M para masculino e F para feminino!!
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Responda M para masculino e F para feminino!");
		 String letra = teclado.next();
		 if (letra.equalsIgnoreCase("M" )) {
			 System.out.println("é masculino");
		 } else if (letra.equalsIgnoreCase("F")) { 
			 System.out.println( "é feminino" );
		 } else {
			 System.out.println("Inválido");}
		 
	}

}
