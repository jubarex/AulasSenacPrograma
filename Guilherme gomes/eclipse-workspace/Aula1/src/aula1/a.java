package aula1;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(somar(4, 4));
		System.out.println(somar(5, 4));
		System.out.println(somar(3, 6));
	} 

	private static float somar(float num1, float num2) {
		float azul = num1 + num2;

		if (num1 == num2) {
			azul = (num1 + num2) * 2;
		}

		return azul;

	}
}
