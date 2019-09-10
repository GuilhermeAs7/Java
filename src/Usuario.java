//Guilherme Alexandre - 0050015038

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String usuario;
	private ArrayList<Tweet> tweets;
	private boolean usuarioLogado;
	private String senha;
	
	public void login() {
		Scanner credencial = new Scanner (System.in);
		System.out.println("Login: ");
		String login = credencial.next();
		System.out.println("Password: ");
		String password = credencial.next();
		
		if(password.contentEquals("poo")) {
			
			usuarioLogado=true; 
			System.out.println("Login efetuado com sucesso!\n");
		}
		else {
			System.out.println("Credencial errada, deseja tentar novamente? (1-Sim/2-Não)");
			String SimNao = credencial.next();
			if(SimNao.contentEquals("1")) {
				login();
			}
		}
	}

	public Usuario()
	{
		tweets = new ArrayList<Tweet>();
	}
	
	public void adicionarTweet(Tweet t1)
	{
		if(usuarioLogado)
		tweets.add(t1);
		else
		System.out.println("Faça o Login para continuar.");
	}
	
	public void imprimirTweet()
	{
		for (int i = 0; i < tweets.size(); i++)
		{
			Tweet t1;
			t1 = tweets.get(i);
			String a = t1.getTexto();
			System.out.println("Tweet : "+a);
		}	
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
