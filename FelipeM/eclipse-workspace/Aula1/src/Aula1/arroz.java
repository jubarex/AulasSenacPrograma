package Aula1;


public class arroz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( somar(2, 3)  );
		System.out.println( subtrair(2, 3)  );
		System.out.println( multiplicar(2, 3)  );
		System.out.println( dividir (2, 3)  );
		
		System.out.println( somar(4, 8)  );
		System.out.println( subtrair(4, 8)  );
		System.out.println( multiplicar(4, 8)  );
		System.out.println( dividir (4, 8)  );
		
		System.out.println( somar(7, 10)  );
		System.out.println( subtrair(7, 10)  );
		System.out.println( multiplicar(7, 10)  );
		System.out.println( dividir (7, 10)  );

	}
	
	private static float somar(float num1, float num2) {
		
		return num1 + num2;
		
	}
	
	private static float subtrair(float num1, float num2) {
		
		return num1 - num2;
		
	}
	private static float multiplicar(float num1, float num2) {
		
		return num1 * num2;
		}
	private static float dividir(float num1, float num2) {
	
	return num1 / num2;
	}
}
