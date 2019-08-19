import java.util.Scanner;

public class Exercicio_LerNome {
	
	public static void main(String[] args){

	Scanner input = new Scanner (System.in); // Nova instancia do objeto 
	System.out.println("Entre com um nome: ");
	String nome = input.next(); // Salva a string
	System.out.println("Fala ae, "+nome);
	}
}
