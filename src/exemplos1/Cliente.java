package exemplos1;

public class Cliente extends Pessoa {
	
	private float salario;
	private String cpf;
	
	public Cliente(String nome) {
		if (nome != null)
		  super.setNome(nome);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
