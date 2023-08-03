package aula2107;

public class exerciciofuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// use os numeros 2 e 3, 4 e 8, 7 e 10
		 
		// somar
		
		System.out.println(somar(2, 3) + " " + subtrair(2, 3));
		System.out.println(somar(4, 8));
		System.out.println(somar (7, 10));
		
		//subtrair
		
     	System.out.println(subtrair(2, 3));
		System.out.println(subtrair(4, 8));
		System.out.println(subtrair(7, 10));
		
	
		
	
		// multiplicar
	
		System.out.println(multiplicar(2, 3));
		System.out.println(multiplicar(4, 8));
		System.out.println(multiplicar(7, 10));
		
		//dividir
		

		System.out.println(dividir(2, 3));
		System.out.println(dividir(4, 8));
		System.out.println(dividir(7, 10));
		
		
	}

	
	
	
	private static float somar(float num1, float num2) {
		float resultado = num1 + num2;
		return resultado;
	}
	
	private static float subtrair(float num1, float num2) {
		float resultado = num1 - num2;
	    return resultado;
	}
	
	
	private static float multiplicar(float num1, float num2) {
	float resultado = num1 * num2;
	
	return resultado;
	}
	
	
	private static float dividir(float num1, float num2) {
	float resultado = num1 / num2;
	
	return resultado;
	}
	
	
	
	
	
	
	
	
	
	
}
