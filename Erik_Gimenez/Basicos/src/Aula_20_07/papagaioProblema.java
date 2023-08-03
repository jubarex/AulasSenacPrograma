package Aula_20_07;

import java.util.Scanner;

public class papagaioProblema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O papagaio esta falando alto?");
		boolean problema = sc.nextBoolean();
		System.out.println("Que horas são?");
		int horas = sc.nextInt();
		if (papagaioProblema(problema , horas) == true) {
			System.out.println("Estamos em apuros");
		}
		else {
			System.out.println("Nâo temos problemas");
		}

	}

	public static boolean papagaioProblema(boolean problema , int horas) {
		
		if (problema == true && (horas > 20 || horas < 7)) {
			return true;
		}
		else {
			return false;
		}
	}

}


