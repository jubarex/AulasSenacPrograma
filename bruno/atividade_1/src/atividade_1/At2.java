package atividade_1;
import java.util.Scanner;
public class At2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double anos, meses, dias;
		
		System.out.println("Informe quantos anos você tem");
		anos = teclado.nextDouble();
		
		System.out.println("Informe quntos meses você tem");
		meses = teclado.nextDouble();
		
		System.out.println("Informe quantos dias você tem");
		dias = teclado.nextDouble();
		
		double diasTotais = anos * 365 + meses * 30 + dias;
		System.out.println("A quantidade totas de dias é " + diasTotais);
		
		
		

	}

}
