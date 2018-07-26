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

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		if (idade > 0) {
			super.idade = idade;
		}		
	}
	
	@Override
	public boolean equals(Object obj) {
//		Cliente cliente1 = (Cliente) obj;
//		if (cliente1.getCpf().equals(this.cpf)) {
//			return true;
//		}
//			return false;
//		OU		
//  	return cliente1.getCpf().equals(this.cpf);
//		OU
		return cliente1.getCpf().equals(((Cliente) obj) this.cpf);		
			

	}
	

}
