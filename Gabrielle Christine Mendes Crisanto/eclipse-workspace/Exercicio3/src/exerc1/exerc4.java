package exerc1;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("numero negativo");
	}

	private static void metodo1() throws Exception {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número");
		int valor = teclado.nextInt();

//		throw new Exception("mensagm")
		if (valor >= 0) {
			System.out.println("");
		} else {
			throw new Exception("deu errooooo");
		}
	}
}
