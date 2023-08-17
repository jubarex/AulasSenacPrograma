package vetorMatriz;

public class printarMatriz {

	public static void main(String[] args) {
		String [][] matriz = {{"X","X", "O"},{"O","O","X"}, {"X", "X", "O"}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if(j!=2) {
					System.out.print("|");
				}
			}
			System.out.println("");
			if (i!=2) {
				System.out.println("-----");	
			}
		}
		
		
		Jogador jogador1 = new Jogador();
		jogador1.simbolo = "X";
		
		Jogador jogador2 = new Jogador();
	}
	
	public static class Jogador{
		String nome;
		int pontuacao;
		String simbolo;
	}

}
