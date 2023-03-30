package Atividade9.PacoteInterno;

public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;
    public ContaPoupanca(String nome, double saldo, String numeroDaConta) {
        super(nome, saldo, numeroDaConta);
        
    }
}