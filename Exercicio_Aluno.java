
public class Aluno {
	
	private String matricula;
	private String curso;
	private String nome;
	
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
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Função para printar atributo
	
	public void MostrarLog(){
		
		System.out.println("Aluno: "+getNome());
		System.out.println("Curso: "+getCurso());
		System.out.println("Matricula: "+getMatricula());
	}

}
