public class PartidaTeste {

	public static void main(String[]args) {
		
		Time tLocal = new Time();
		Time tVisitante = new Time();
		
		tLocal.setNome("Vasco");
		tVisitante.setNome("Fluminense");
		
		Partida P = new Partida();

		P.setTimeLocal(tLocal);
		P.setTimeVisitante(tVisitante);
		
		System.out.println("----- Resultado da 1º Partida -----");

		P.iniciarPartida();
		P.mostrarResultado();
		P.finalizarPartida();
		
		System.out.println("----- Tabela do Campeonato -----");
		
		tLocal.listar();
		System.out.println("\n");
		tVisitante.listar();
		
		System.out.println("\n----- Resultado da 2° Partida -----");

		P.iniciarPartida();
		P.mostrarResultado();
		P.finalizarPartida();
		
		System.out.println("----- Tabela do Campeonato -----");
		
		tLocal.listar();
		System.out.println("\n");
		tVisitante.listar();
	}	
}