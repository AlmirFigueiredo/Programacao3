package Atividade8;

public abstract class Conta {
    protected String nome;
    protected String cpf;
    protected double saldo;
    protected String numeroDaConta;

    public Conta(){}
    public Conta(String nome, String cpf, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldoInicial;
    }

    public void CriarNumeroDaConta() {
        String conta = "";
        for(int i = 0; i < 6; i++) {
            conta += (int)Math.random()*9;
        }
        conta += "-";
        conta += (int)Math.random()*9;
        this.numeroDaConta = conta;
    }
}
