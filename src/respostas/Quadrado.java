package respostas;

public class Quadrado {

	private float tamanhoLado;

	public float getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(float tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public float calculaArea() {
		return tamanhoLado * 4;
	}
}
