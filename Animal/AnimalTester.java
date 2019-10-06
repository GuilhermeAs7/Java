public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ave a = new Ave();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		Mamifero m = new Mamifero();
		
		a.setPeso(1.2f);
		a.setIdade(4);
		a.setMembros(2);
		a.setCorPena("azul");
		
		p.setPeso(0.2f);
		p.setIdade(2);
		p.setMembros(0);
		p.setCorEscama("Amarelo");	
			
		r.setPeso(7.2f);
		r.setIdade(40);
		r.setMembros(4);
		r.setCorEscama("Verde");
		
		m.setPeso(45.2f);
		m.setIdade(20);
		m.setMembros(4);
		m.setCorPelo("Preto");
		
		a.emitirSom();
		a.alimentar();
		a.locomover();
		a.fazerNinho();
		
		p.emitirSom();
		p.alimentar();
		p.locomover();
		p.soltarBolha();
		
		r.emitirSom();
		r.alimentar();
		r.locomover();		
		
		m.emitirSom();
		m.alimentar();
		m.locomover();
	}
}
