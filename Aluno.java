
public class Aluno {
	
	private String matricula;
	private String curso;
	private String nome;
	
	//Fun��es para mudan�a no atributo 
	
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
	
	//Fun��o para printar atributo
	
	public void MostrarLog(){
		
		System.out.println("Aluno: "+getNome());
		System.out.println("Curso: "+getCurso());
		System.out.println("Matricula: "+getMatricula());
	}

}
