public class Aluno {
	
	private String matricula;
	private String curso;
	private String nome;
	private String faculdade;
	
	public Aluno(){ //metodo construtor 
		
		this.faculdade="Unilasalle-RJ";
	}
	
	//Funções para mudança no atributo 
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		
		if(curso.toUpperCase().equals("SI")){ // Coloca todas as letras em maiusculo e compara com SI, se for igual
			this.curso="Sistemas de Informação"; // Escreve em curso Sistemas de Informação
		}
		else 
			this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFaculdade(){
		return faculdade;
	}
	
	public void setFaculdade(){
		this.faculdade=faculdade;
	}
	
	//Função para printar atributo

	public void MostrarLog(){
		
		System.out.println("Aluno: "+getNome());
		System.out.println("Curso: "+getCurso());
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Faculdade: "+getFaculdade());
	}
}


