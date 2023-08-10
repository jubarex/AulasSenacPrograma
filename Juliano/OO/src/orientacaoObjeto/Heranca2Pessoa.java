package orientacaoObjeto;

public class Heranca2Pessoa {

	public static void main(String[] args) {
		System.out.println("teste");
		
		Androide numero18 = new Androide("Careca", 
				"Olho verde", 
				"Cinza", 
				(float) 1.85, 
				false, 
				"Nome do Robô", 
				"Robótico");
		numero18.respirar();
	}
	
	public static class Pessoa {
		public Pessoa(String cabelo, String corOlho, String corPele, float altura, boolean problemaVisao, String nome,
				String genero) {
			super();
			this.cabelo = cabelo;
			this.corOlho = corOlho;
			this.corPele = corPele;
			this.altura = altura;
			this.problemaVisao = problemaVisao;
			this.nome = nome;
			this.genero = genero;
		}

		String cabelo;
		String corOlho;
		String corPele;
		float altura;
		boolean problemaVisao = false;
		String nome;
		String genero;
		
		public void respirar() {
			System.out.println(this.nome+ " está inspirando..");
			System.out.println(this.nome+ " está expirando..");
		}
		
	}
	
	public static class Androide extends Pessoa {
		public Androide(String cabelo, String corOlho, String corPele, float altura, boolean problemaVisao, String nome,
				String genero) {
			super(cabelo, corOlho, corPele, altura, problemaVisao, nome, genero);
	
		}
		
	}
	
}
