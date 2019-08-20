import java.util.Scanner; 
public class Exercicio_StringIguais {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Entre com o primeiro nome: ");
		String nome1 = input.next();	
		
		System.out.println("Entre com o segundo nome: ");
		String nome2 = input.next();
		
		//Coloca as strings em caixa alta
		nome1 = nome1.toUpperCase();
		nome2 = nome2.toUpperCase();
		
		if(nome1.equals(nome2)){ // compara se as duas strings sao iguais
			
			System.out.println("Nomes iguais");
		}
		else{
			
			System.out.println("Nomes diferentes");
		}
	}

}
