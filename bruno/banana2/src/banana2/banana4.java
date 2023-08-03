package banana2;
import java.util.Scanner;
public class banana4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("digite o seu genero, M para masculino e F para feminino");
		 String genero = teclado.next();
		 
		 if(genero.equalsIgnoreCase("M")) {
			 System.out.println("masculino");
			 
		 }
		 else if(genero.equalsIgnoreCase("F")) {
			 System.out.println("Feminino");
			 
		 }
		 else {
			 System.out.println("Sexo invalido!");			 
		 }
		 

	}

}
