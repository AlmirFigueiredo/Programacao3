package Atividade8.PacotePrincipal;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private String numeroDaConta;

    public Conta(){}
    public Conta(String nome, String cpf, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldoInicial;
        criarNumeroDaConta();
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void modificarSaldo(double valor) {
        this.saldo += valor;
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
