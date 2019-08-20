import java.util.Scanner; 
public class Exercicio_StringIguais {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Entre com o primeiro nome: ");
		String nome1 = input.next();	
		
		System.out.println("Entre com o segundo nome: ");
		String nome2 = input.next();
		
		// compara se as duas strings sao iguais .eguals e 
		//ignora caixa alta ou baixa .IgnoreCase
		
		if(nome1.equalsIgnoreCase(nome2)){ 
			
			System.out.println("Nomes iguais");
		}
		else{
			
			System.out.println("Nomes diferentes");
		}
	}

}
