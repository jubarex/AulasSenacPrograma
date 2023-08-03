package exercicio11071;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	

	
		    Scanner Teclado = new Scanner(System.in);
            System.out.println("Informe o seu sexo (F/M)");

            String sexo = Teclado.nextLine();
           
            if (sexo == "F") {

                System.out.println("Sexo Feminino");

            }

            else if(sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
            }

	  else {
		System.out.println("Sexo Invalido");
	
       
	}
		
		
	}
}


