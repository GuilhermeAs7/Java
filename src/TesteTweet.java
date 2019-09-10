
public class TesteTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user  = new Usuario();
		Tweet t1 = new Tweet();
		Tweet t2 = new Tweet();
		
		user.login();
		
		user.setUsuario("Aaa");
		
		t1.Twittar();
		user.adicionarTweet(t1);
		user.imprimirTweet();
	}

}
