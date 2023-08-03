package exer2;

import java.util.Scanner;
public class Exer3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe o gênero (M OU F)");
		String genero = teclado.next();
		
		if(genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino!");
		}
		else if(genero.equalsIgnoreCase("F")) {
			System.out.println("Feminino!");
		}
		else {
			System.out.println("Sexo inválido!");
		}
	}

}
