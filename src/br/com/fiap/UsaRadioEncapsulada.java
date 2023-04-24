package br.com.fiap;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {
		
		RadioEncapsulada radio1 = new RadioEncapsulada();
		
		radio1.setVolume(50);
		radio1.setEstaçao(80.5f);
		
		radio1.mostrar();
		radio1.aumentarVolume();
		radio1.mostrar();

	}

}
