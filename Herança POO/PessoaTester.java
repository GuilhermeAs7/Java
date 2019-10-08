
public class PessoaTester {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Tecnico t = new Tecnico();
		Bolsista b = new Bolsista();
		Visitante v = new Visitante();
		Professor p = new Professor();
		
		a.setNome("Guilherme");
		a.setMatricula(00500);
		a.setSexo("M");
		a.setIdade(21);
		a.setCurso("SI");
		a.pagarMensalidade();
		
		t.setNome("Cleyton");
		t.setMatricula(884400);
		t.setSexo("M");
		t.setIdade(24);
		t.setCurso("ADM");
		t.setRegistroProfissional("Pacote Office");
		t.pagarMensalidade();
		t.praticar();
		
		b.setNome("Gabi");
		b.setMatricula(8600);
		b.setSexo("F");
		b.setIdade(22);
		b.setCurso("SI");
		b.setBolsa(200);
		b.pagarMensalidade();
		b.renovarBolsa();
		
		v.setNome("Beatriz");
		v.setSexo("F");
		v.setIdade(20);
		
		p.setNome("Gretchen");
		p.setEspecialidade("Dança");
		p.setSexo("F");
		p.setIdade(50);
		p.setSalario(4000);
		p.receberAumento(500);
		
	}

}
