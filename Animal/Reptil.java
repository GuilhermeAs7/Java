public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Reptil Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Reptil Comendo");
	}
	@Override
	public void emitirSom() {
		System.out.println("\nSom de Reptil");
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
