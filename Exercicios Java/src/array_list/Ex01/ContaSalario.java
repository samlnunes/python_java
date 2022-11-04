package Ex01;

public class ContaSalario extends Conta {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public ContaSalario() {
    }
   
    public ContaSalario(String agencia, String numero, double saldo, String cnpj) {
        super(agencia, numero, saldo);
       
        this.cnpj = cnpj;
    }
}
