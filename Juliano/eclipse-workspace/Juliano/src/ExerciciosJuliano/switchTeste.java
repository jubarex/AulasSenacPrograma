package ExerciciosJuliano;

public class switchTeste {

	public static void main(String[] args) {

		try {
			System.out.println(contas(2, 3, "somar"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("continuou mesmo com erro ");
		
	}

	private static float contas(float valor1, float valor2, String operacao) throws Exception {

		float resultado = 0;

		switch (operacao) {
		case "somar":
			resultado = valor1 + valor2;
			break;

		case "subtrair":
			resultado = valor1 - valor2;
			break;

		default:
			throw new Exception("Você inseriu a operação incorretamente: " + operacao);

			
		}
		return resultado;
	}

	private void switchSozinho() {
		
		
		
//		switch (key) {
//		case value:
//
//			break;
//		case value:
//
//			break;
//		case value:
//
//			break;
//
//		default:
//			break;
//		}
//		
//		
//		
//		if(key == case0) {
//			
//			
//		} else if (key == case1) {
//		
//		} else if (key == case2) {
//			
//			
//		} else if (key == case3) {
//			
//			
//		} else {
//			
//		
//		}
//		
		
		
		
		
		

	}
}
