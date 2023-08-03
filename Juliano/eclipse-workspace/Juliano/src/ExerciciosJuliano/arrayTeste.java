package ExerciciosJuliano;

public class arrayTeste {

	public static void main(String[] args) {
		int tamanhoVetor = 5;
		int[] nomeVariavel = new int[tamanhoVetor]; 
    //                  4 < 5
	//                  i < tamanhoVetor
		for (int i = 0; i <= (tamanhoVetor-1); i++) {
			nomeVariavel[i] = (i+1);
		}
		for (int posicao = 0; posicao < nomeVariavel.length; posicao++) {
			System.out.print(nomeVariavel[posicao]+ " ");
		}
		System.out.println("");
		System.out.println("Posição 1: " + nomeVariavel[1]);
//		System.out.println(numerosDaMegaSena.length);
//		System.out.println(tamanhoVetor);
		
	
	}

}
