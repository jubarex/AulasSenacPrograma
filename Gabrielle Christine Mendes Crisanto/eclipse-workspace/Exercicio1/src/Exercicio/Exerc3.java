package Exercicio;

import java.util.Scanner;
public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe o gênero (M ou F)");
		String genero = teclado.next();
		
		if( genero.equalsIgnoreCase("M") ) {
			System.out.println ("Masculino");
		}

			else if (genero.equalsIgnoreCase("F")){
				System.out.println("Feminino");
		}
			else {
				System.out.println("sexo inválido");
			}

			}

		}