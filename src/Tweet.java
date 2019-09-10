//Guilherme Alexandre - 0050015038

import java.util.Scanner;

public class Tweet {
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void Twittar()
	{
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o Tweet: ");
		String tt = dados.nextLine();
		if(tt.length() >= 10)
		{
			System.out.println("Tweet com mais de 140 caracteres");
		}
		else
		{
			Scanner confirm = new Scanner (System.in);
			System.out.println("Deseja twittar -> "+tt+" <-? (1-Sim / 2-Não)");
			String aux = confirm.next();
			if(aux.equals("1")) {
				texto = tt;
				Scanner confirm2 = new Scanner (System.in);
				System.out.println("Deseja Twittar novamente? (1-Sim / 2-Não)");
				String aux2 = confirm2.next();
				if(aux2.equals("1"))
				Twittar();	
				
			}
			}
		}
		
	}
