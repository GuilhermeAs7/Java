public class Mamifero extends Animal {
	
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("Mamifero Caminhando");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamifero Comendo");
	}
	@Override
	public void emitirSom() {
		System.out.println("\nSom de Mamífero");
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
