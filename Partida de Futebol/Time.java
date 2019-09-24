public class Time {
	
		private String nome;
		private int qtdPontos;
		private int qtdVitorias;
		private int qtdEmpates;
		private int qtdDerrotas;

		void Time() {
			
			qtdPontos = 0;
			qtdVitorias = 0;
			qtdEmpates = 0;
			qtdDerrotas = 0;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQtdPontos() {
			return qtdPontos;
		}
		public void setQtdPontos(int qtdPontos) {
			this.qtdPontos = qtdPontos;
		}
		public int getQtdVitorias() {
			return qtdVitorias;
		}
		public void setQtdVitorias(int qtdVitorias) {
			this.qtdVitorias = qtdVitorias;
		}
		public int getQtdEmpates() {
			return qtdEmpates;
		}
		public void setQtdEmpates(int qtdEmpates) {
			this.qtdEmpates = qtdEmpates;
		}
		public int getQtdDerrotas() {
			return qtdDerrotas;
		}
		public void setQtdDerrotas(int qtdDerrotas) {
			this.qtdDerrotas = qtdDerrotas;
		}
	
		public void listar(){
		
		System.out.println(nome);
		System.out.println("Pontos: " +qtdPontos);
		System.out.println("Vitorias: " +qtdVitorias);
		System.out.println("Empates: " +qtdEmpates);
		System.out.println("Derrotas: " +qtdDerrotas);
		}
	}