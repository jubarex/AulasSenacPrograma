package orientacaoObjeto;

import java.util.Scanner;

public class CalculadoraTest1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 12;
		double aa = 5.0;
		double bb = 12.5;
		Scanner nomeDoScanner = new Scanner(System.in);
		int nomeVariavelInt = 0;
		Calculadora calculadoraObjeto = new Calculadora();
		System.out.println(calculadoraObjeto.somar("3",b));
	}
	public static class Calculadora{
		int somar(int a, int b) {
			return a+b;
		}
		String somar(String string, int b) {
			return string+b;
		}
		double somar(double aa, double bb) {
			return aa+bb;
		}
		String somar(String stringA, String stringB) {
			return stringA+stringB;	
		}
	}
	
}
