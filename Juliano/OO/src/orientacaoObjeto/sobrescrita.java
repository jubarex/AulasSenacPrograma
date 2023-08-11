package orientacaoObjeto;

public class sobrescrita {

	
	public static void main(String[] args) {
		Cachorro poodle = new Cachorro();
		poodle.emitirSom();
	}
	abstract static class Animal{
		abstract void emitirSom();
		abstract void passear();
		abstract void respirar();
	}

	public static class Cachorro extends Animal{
		@Override
		void emitirSom() {
			System.out.println("mostrar");
		}
		@Override
		void passear() {
			System.out.println("passear");
		}
		@Override
		void respirar() {
			System.out.println("Respirar");
		}
	
	}

}
