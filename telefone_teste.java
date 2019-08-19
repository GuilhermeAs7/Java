
public class telefone_teste {
		
	    public static void main(String args[]) {
	        
	        telefone t1;
	        t1=new telefone();
	        t1.modelo="Iphones Xs";
	        t1.cor="Preto";
	        t1.bateria=23;
	        t1.rede=true;
	        
	        // Metodos
	        t1.ligar_desligar();
	        t1.ligacao();
	        t1.quant_bateria();
	    }
	}
