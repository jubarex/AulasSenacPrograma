package atividade_14_07;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	double Km, litros;
	
	 System.out.println("digite a quantidae de Km percorridos!");
	 Km = teclado.nextDouble();
	 
	 System.out.println("digite a quantidade de combustivel gasto!");
	 litros = teclado.nextDouble();
	 
	 double total = (Km / litros);
	 System.out.println("O total de combustivel gasto foi de: "+ total);
	 
	 

}
}
