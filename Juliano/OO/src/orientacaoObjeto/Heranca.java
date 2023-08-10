package orientacaoObjeto;

public class Heranca {

	public static void main(String[] args) {

		
		Veiculo veiculo1 = new Veiculo("Modelo", 10, "Vermelho", 5, "Motor v8", 20, 30, 40, false);
		
		veiculo1.mostrarVeiculo();
		
	
		
		veiculo1.modelo = "Modelo Novo 1";
		System.out.println(veiculo1.modelo);
		
		
		veiculo1.setModelo("Modelo Novo 2");
		System.out.println(veiculo1.getModelo());
		
		
		//		veiculo1.printModelo();
		
	
		
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

		public Veiculo(String modelo, int ano, String cor, int quantidadePortas, String motor, int quantidadeRodas,
				int capacidadePassageiros, float velocidade, boolean ligado) {
			super();
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.quantidadePortas = quantidadePortas;
			this.motor = motor;
			this.quantidadeRodas = quantidadeRodas;
			this.capacidadePassageiros = capacidadePassageiros;
			this.velocidade = velocidade;
			this.ligado = ligado;
		}

		public void printModelo() {
			System.out.println("Esse modelo é o: "+this.modelo);
			
		}

		public void mostrarVeiculo() {
			System.out.println("--------------------------------------------");
			System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + " Cor: " +this.cor);
			System.out.println("Quantidade portas: " + this.quantidadePortas);
			System.out.println("Quantidade rodas: " + this.quantidadeRodas);
			System.out.println("Capacidade passageiros: " + this.capacidadePassageiros);
			System.out.println("Motor: " + this.motor);
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
			
			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public int getAno() {
				return ano;
			}

			public void setAno(int ano) {
				this.ano = ano;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			public int getQuantidadePortas() {
				return quantidadePortas;
			}

			public void setQuantidadePortas(int quantidadePortas) {
				this.quantidadePortas = quantidadePortas;
			}

			public String getMotor() {
				return motor;
			}

			public void setMotor(String motor) {
				this.motor = motor;
			}

			public int getQuantidadeRodas() {
				return quantidadeRodas;
			}

			public void setQuantidadeRodas(int quantidadeRodas) {
				this.quantidadeRodas = quantidadeRodas;
			}

			public int getCapacidadePassageiros() {
				return capacidadePassageiros;
			}

			public void setCapacidadePassageiros(int capacidadePassageiros) {
				this.capacidadePassageiros = capacidadePassageiros;
			}

			public float getVelocidade() {
				return velocidade;
			}

			public void setVelocidade(float velocidade) {
				this.velocidade = velocidade;
			}

			public boolean isLigado() {
				return ligado;
			}

			public void setLigado(boolean ligado) {
				this.ligado = ligado;
			}
		
		
			}



	public static class Carro extends Veiculo {

		public Carro(String modelo, int ano, int quantidadePortas, int quantidadeRodas, int capacidadePassageiros,
				float velocidade, String cor, String motor) {
			super(modelo, ano, quantidadePortas, quantidadeRodas, capacidadePassageiros, velocidade, cor, motor);
			
		}


		
		
	}

	public static class Moto extends Veiculo {

		public Moto(String modelo, int ano, int quantidadePortas, int quantidadeRodas, int capacidadePassageiros,
				float velocidade, String cor, String motor) {
			super(modelo, ano, quantidadePortas, quantidadeRodas, capacidadePassageiros, velocidade, cor, motor);
			// TODO Auto-generated constructor stub
		}
		
	}

}
