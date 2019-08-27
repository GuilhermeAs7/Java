import java.util.Scanner;
public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(); 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o Nome: ");
		aluno.setNome(input.next());
		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(input.next());
		System.out.println("Entre com o curso: ");
		aluno.setCurso(input.next()); // Receber o curso pelo teclado
		
		aluno.MostrarLog(); // Chama função para printar 
	}

}
