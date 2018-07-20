package exemplos;

public class Fabricante {
	
	private String nome;
	private String sigla;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return this.sigla;
	}
	
	@Override
	public String toString() {
		String fabricante = "Fabricante{";
		fabricante += "nome=" + this.nome + ", ";
		fabricante += "sigla=" + this.sigla;
		fabricante += "}";		
		return fabricante;
	}
	
}
