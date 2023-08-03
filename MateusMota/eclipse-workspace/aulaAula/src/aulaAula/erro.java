package aulaAula;

import java.util.Scanner;

public class erro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			erroteste();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void erroteste() throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		int erroteste = teclado.nextInt();
		
		System.out.println("Teste de try and catch");
		if(erroteste < 0 ) {
			System.out.println("erro");
			throw new Exception(""
					+ "ERROR"
					+ "404");
		}else {
			System.out.println("positivo");
		}
		System.out.println("exatmente isso");
	
		
	}
	

}
