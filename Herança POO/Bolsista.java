
public class Bolsista extends Aluno {
	
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("\nBolsa renovada com sucesso!");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Pagamento da mensalidade efetuado. Bolsa de R$ "+bolsa);
	}
}
