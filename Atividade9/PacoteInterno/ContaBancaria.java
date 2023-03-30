package Atividade9.PacoteInterno;

public abstract class ContaBancaria {
    private String nomeDoCliente;
    private double saldo;
    private String numeroDaConta;

    public ContaBancaria(String nome, double saldo, String numeroDaConta){
        this.nomeDoCliente = nome;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;

    }
    //Getters:
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    //Setters:
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
