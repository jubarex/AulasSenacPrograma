package ExerciciosJuliano;

public class mostrarErro {
//	throws Exception
	public static void main(String[] args) {

		// pede número pro usuário
		// se for negativo, dá o erro na tela
		// continua rodando e mostra uma mensagem padrão
		// throws Exception
//		throw new Exception("a");
		try {
			arroz();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Continuou mesmo com erro");

	}

	private static void arroz() throws Exception {
		System.out.println("Rodando arroz");
		throw new Exception("erro arroz personalidado 123124124124");

	}

}
