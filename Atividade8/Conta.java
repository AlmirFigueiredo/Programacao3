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

    public void criarNumeroDaConta() {
        String conta = "";
        for(int i = 0; i < 6; i++) {
            conta += (int)Math.random()*9;
        }
        conta += "-";
        conta += (int)Math.random()*9;
        this.numeroDaConta = conta;
    }
    @Override 
    public boolean equals(Object conta) {
        if(this == conta) {
            return true;
        }
        if(!(conta instanceof Conta)) {
            return false;
        }
        Conta contaObj = (Conta)conta;
        return this.cpf.equals(contaObj.cpf) && this.numeroDaConta.equals(contaObj.numeroDaConta);
    }

}
