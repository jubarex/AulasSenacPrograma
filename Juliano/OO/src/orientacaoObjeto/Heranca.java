package orientacaoObjeto;

public class Heranca {

	public static void main(String[] args) {

		
		Veiculo veiculo1 = new Veiculo("Modelo 1", 2024, 4, 6, 8, 0, "vermelho", "motor v8");
		
		veiculo1.mostrarVeiculo();
		
		
	
		
//		Carro ferrari = new Carro();
//		System.out.println(ferrari.modelo);
//		ferrari.modelo = 1;
//		ferrari.ano = 2024;
//		ferrari.capacidadePassageiros = 2;
//		ferrari.cor = "vermelha";
//		ferrari.motor = "motor v8 turbo";
//		ferrari.quantidadePortas = 2;
//		ferrari.velocidade = 0;
//		ferrari.quantidadeRodas = 4;
//	 System.out.println(ferrari.modelo);
//	 Veiculo tanque = new Veiculo();
//	 System.out.println(tanque.modelo);
	}

	public static class Veiculo {

		public Veiculo(String modelo, int ano, int quantidadePortas, int quantidadeRodas, int capacidadePassageiros,
				float velocidade, String cor, String motor) {
			this.modelo = modelo;
			this.ano = ano;
			this.quantidadePortas = quantidadePortas;
			this.quantidadeRodas = quantidadeRodas;
			this.capacidadePassageiros = capacidadePassageiros;
			this.velocidade = velocidade;
			this.cor = cor;
			this.motor = motor;
		}
		
		public void mostrarVeiculo() {
			System.out.println("--------------------------------------------");
			System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + " Cor: " +this.cor);
			System.out.println("Quantidade portas: " + this.quantidadePortas);
			System.out.println("Quantidade rodas: " + this.quantidadeRodas);
			System.out.println("Capacidade passageiros: " + this.capacidadePassageiros);
			System.out.println("Velocidade: " + this.velocidade + "km/h");
			if(this.ligado) {
				System.out.println("Ligado: está ligado");
			}else {
				System.out.println("Ligado: está desligado");
			}
			System.out.println("____________________________________________");
		}

			String modelo;
			int ano;
			String cor;
			int quantidadePortas;
			String motor;
			int quantidadeRodas;
			int capacidadePassageiros;
			float velocidade;
			boolean ligado = false;
		
		
		public String setModelo(String novoModelo) {
			this.modelo = novoModelo;
			return this.modelo;
		}
		
		public String getModelo() {
			return this.modelo;
		}
	}

//	public static class Carro extends Veiculo {
//
//		
//		
//	}

//	public static class Moto extends Veiculo {
//	}

}
