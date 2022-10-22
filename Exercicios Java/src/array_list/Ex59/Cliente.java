package array_list.Ex59;

public class Cliente {
	private int id;
	private int idade;
	private String nome;
	private ContaBancaria conta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	Cliente(){	}
	
	Cliente(String nome, int id, int idade, ContaBancaria conta) {
		this.nome = nome;
		this.id = id;
		this.idade = idade;
		this.conta = conta;
	}
}
