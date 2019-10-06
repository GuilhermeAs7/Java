public class Peixe extends Animal{
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Peixe Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Peixe Comendo");
	}
	@Override
	public void emitirSom() {
		System.out.println("\n~Peixe não faz som~");
	}
	public void soltarBolha() {
		System.out.println("Peixe Soltando bolhas");
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
