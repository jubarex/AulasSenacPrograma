package Aula1;

import java.util.Scanner;
public class exerlivre {

	public static void main(String[] args) {
	
	try {
		exer();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	private static void exer() throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe um número");
		
		int num = teclado.nextInt();
		if (num >=0) {
		System.out.println("positivo");
		
		}
		else {
		throw new Exception("erro personalizado");
		}
	}
}
