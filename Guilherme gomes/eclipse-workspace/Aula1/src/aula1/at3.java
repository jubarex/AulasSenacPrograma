package aula1;

public class at3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtrair(6, 3));
		System.out.println(multiplicar(9, 9));
		System.out.println(dividir(7, 10));
	    System.out.println(somar(10,10));
	}   

	private static float subtrair(float num1, float num2) {
		float laranja = num1 - num2;

		return laranja;

	}

	private static float multiplicar(float num1, float num2) {
		float laranja = num1 * num2;

		return laranja;

	}

	private static float dividir(float num1, float num2) {
		float laranja = num1 / num2;

		return laranja;
		
		
		}
      private static float somar (float num1, float num2) {
	float laranja = num1 + num2;

	return laranja; 
      }
}
