package orientacaoObjeto;

public class Heranca2Pessoa {

	public static void main(String[] args) {
		System.out.println("teste");

		Androide numero18 = new Androide("Careca", "Olho verde", "Cinza", (float) 1.85, false, "WALL-E","Robótico");
		numero18.respirar();
		System.out.println("Usando get cabelo: "+numero18.getCabelo());
		numero18.mostrarNaTela();
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
			System.out.println(this.nome + " está inspirando..");
			System.out.println(this.nome + " está expirando..");
		}

		public String getCabelo() {
			return cabelo;
		}

		public void setCabelo(String cabelo) {
			this.cabelo = cabelo;
		}

		public String getCorOlho() {
			return corOlho;
		}

		public void setCorOlho(String corOlho) {
			this.corOlho = corOlho;
		}

		public String getCorPele() {
			return corPele;
		}

		public void setCorPele(String corPele) {
			this.corPele = corPele;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public boolean isProblemaVisao() {
			return problemaVisao;
		}

		public void setProblemaVisao(boolean problemaVisao) {
			this.problemaVisao = problemaVisao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

	}

	public static class Androide extends Pessoa {
		public Androide(String cabelo, String corOlho, String corPele, float altura, boolean problemaVisao, String nome,
				String genero) {
			super(cabelo, corOlho, corPele, altura, problemaVisao, nome, genero);

		}
		
		
		public void mostrarNaTela() {
			System.out.println("--------------------------------------------");
			System.out.println("Cabelo: " + this.cabelo);
			System.out.println("Cor dos olhos: " + this.corOlho);
			System.out.println("Cor da pele: " + this.corPele);
			System.out.println("Altura: " + this.altura + "m");
			System.out.println("Nome: " + this.nome);
			System.out.println("Gênero: " + this.genero);
			if(this.problemaVisao) {
				System.out.println("Tem problema de visão");
			}else {
				System.out.println("Não tem problema de visão");
			}
			System.out.println("____________________________________________");
		}

	}

}
