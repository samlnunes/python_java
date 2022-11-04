package array_list.Ex60;

import java.util.ArrayList;

public class ContaBancaria {
    private String agencia = "4422";
    private String numero;
    private double saldo;
    private double limite = 75;
    private ArrayList<String> extrato;

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }

    public

    ContaBancaria() {
        this.extrato = new ArrayList<>();
    }

    ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void Depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        this.extrato.add("+ Depósito $" + valorDeposito);
    }

    public void Sacar(double valorSaque) {
        this.saldo -= valorSaque;
        this.extrato.add("+ Saque $" + valorSaque);
    }

    public void Transferir(double valorTransf, Cliente destinatario) {
        Sacar(valorTransf);
        destinatario.getConta().Depositar(valorTransf);
        this.extrato.add("+ Transferência $" + valorTransf);
    }

    public double ConsultarSaldo() {
        return (this.saldo);
    }

    public String ConsultarExtrato() {
        String resultado = "";
        for (String op: extrato) {
            resultado = resultado + op + "\n";
        }
        return resultado;
    }

}
