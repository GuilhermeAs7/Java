public class telefone {

	 String modelo;
	 String cor;
	 int bateria;
	 boolean rede;
	 boolean onOff;
	 
	 void ligar_desligar(){
		 
		 if(onOff==true){
			 onOff=false;
		 }
		 else{
			 if(bateria==0){
				 System.out.println(modelo+" sem bateria!");
			 }
			 else{
			 System.out.println(modelo+" ligando...");
			 onOff=true;
			 bateria--;
			 }	 
		 }
		 
	 }
	 
	 void ligacao(){
		 
		 if(bateria>0 && onOff==true && rede==true){
			 
			 System.out.println(modelo+" realizando chamada...Alô!?");
			 bateria--;
		 }
		 else if(bateria<=0){
			 
			 System.out.println(modelo+" sem bateria!");
		 }
		 else if(rede==false){
			 
			 System.out.println(modelo+"sem sinal");
		 }
		  
	 }
	 
	 void quant_bateria(){
		 
		 if(bateria<=20 && bateria>=0){
			 
			 System.out.println(modelo+" bateria precisa ser carregada "+bateria+"%");
		 }
		 else if (bateria<=100 && bateria>20){
			 
			 System.out.println(modelo+" bateria não precisa ser carregada, "+bateria+"%");
		 }
	 }
}
