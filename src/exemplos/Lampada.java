package exemplos;

public class Lampada {	
	
	private Fabricante fabricante;
	private float potencia;	//Atributos
	private boolean estado;
	
	void acender() { //Metodos
		this.estado = true;
	}
	
	void apagar () {
		this.estado = false;
	}

	boolean getEstado() {
		return this.estado;
	}
	
	float getPotencia() {
		return this.potencia;
	}
	
	void setPotencia(float potencia) {
		if (potencia > 0) {
			this.potencia = potencia; // o this serve para atributos e metodos da clase
		}
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		String lampada = "Lampada{";
		lampada += "potencia=" + this.potencia + ", ";
		lampada += "estado=" + this.estado + ", ";
		lampada += "fabricante=" + this.fabricante;
		lampada += "}";
		return lampada;
	}
}
