package exemplos1;

public abstract class Pessoa {
	
	private String nome;
	protected int idade;
	private float altura;
	private float peso;
	
	public Pessoa() {}	//Construtor
	
	public Pessoa(String nome) {	//Construtor	
		this.setNome(nome);
	}
	
	public Pessoa(String nome, int idade, float altura, float peso) { //Construtor		
		this.setNome(nome);
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() < 4)
		   this.nome = nome.toUpperCase();
	}
	public int getIdade() {
		return idade;
	}
	
	public abstract void setIdade(int idade); // Obriga a refazer este método no objetos herdado desta class
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
}
