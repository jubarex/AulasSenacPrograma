package Basicos;
import java.util.Scanner;
public class ErroPersonalizado {
	public static void main(String[] args) throws Exception {

		
		try {
			arroz();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Continou mesmo com erro");
	}
	public static void arroz() throws Exception {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Diga um numero");
		int a = teclado.nextInt();
		System.out.println("Mostrando arroz");
		if (a < 0) {
			throw new Exception ("Arroz erro");
		
		}
	}
}
