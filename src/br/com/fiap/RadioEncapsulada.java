package br.com.fiap;

public class RadioEncapsulada {
	
	private int volume;
	private float estaçao;
	
	// para criar getters e setters automaticamente
	// tecla de atalho: Ctrl+3 (lupinha)
	//digite ggas (Generate gatters e setters)
	//clique em select All e dps em Generate
		
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa permitida(0 a 100)");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public float getEstaçao() {
		return estaçao;
	}
	public void setEstaçao(float estaçao) {
		try {
			if (estaçao >= 80.0 && estaçao <= 105.0) {
				this.estaçao = estaçao;
			} else {
				throw new Exception("Estação fora da faixa permitida");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	public void mostrar() {
		System.out.println("Volume atual: " + volume);
		System.err.println("Estaçao atual: " + estaçao);
	}
	
}
