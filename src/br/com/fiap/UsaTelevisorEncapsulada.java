package br.com.fiap;

public class UsaTelevisorEncapsulada {

	public static void main(String[] args) {
		TelevisorEncapsulada tv1 = new TelevisorEncapsulada();
		
		tv1.setVolume(12);
		tv1.setCanal(10);
		
		tv1.mostrar();
		tv1.aumentarVolume();
		tv1.mostrar();
				
	}

}
