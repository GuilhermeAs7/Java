import java.util.Scanner; 
public class Exercicio_Vetor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int [5];
		int maior=0;
		int i;
		
		for(i=0;i<5;i++){
			
			System.out.println("Entre com o aluno: "+(i+1));
			num[i] = input.nextInt();
			
			if(num[i] > maior){
				
				maior=num[i];
			}
		}
		System.out.println("Maior numero: "+maior);
	}
}
