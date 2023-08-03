
package aula1;
import java.util.Scanner;

public class ATVD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtdMacas;
		double valor;
		System.out.println("informe a quantidade de maças");
		qtdMacas = teclado.nextInt();
		
		if(qtdMacas >= 12) {
			valor = qtdMacas * 1.0;
			
	}
		else {
			valor = qtdMacas * 1.3;
			
		}
        System.out.println("valor total: "+ valor);
        
	}
}
