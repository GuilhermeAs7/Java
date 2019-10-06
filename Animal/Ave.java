public class Ave extends Animal{
	
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Ave Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Ave Comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nSom de Ave");
	}
	
	public void fazerNinho() {
		System.out.println("Ave fazendo ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}