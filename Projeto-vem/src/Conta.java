public abstract class Conta {
	
	private String nome;
	private int idade;
	private String cpf;
	private int tipo; //[1] VEM Comum  [2] VEM estudante [3] VEM trabalhador [] VEM livre acesso
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void Deposita(double i) {
		this.saldo += i;
		System.out.println("Você adicionou R$" + saldo + " no seu Vale Transporte...");

	}
	
	public void Pagamento() {
	return;
	}
}