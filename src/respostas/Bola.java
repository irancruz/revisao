package respostas;

public class Bola {
	
	private String cor;
	private float circunferencia;
	private String material;
	
    public void trocarCor(String cor) {
    	this.cor = cor;
    }

    public String mostraCor() {
		return this.cor;
	}
}
