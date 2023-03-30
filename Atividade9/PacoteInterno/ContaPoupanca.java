package Atividade9.PacoteInterno;

public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;
    public ContaPoupanca(String nome, double saldo, String numeroDaConta) {
        super(nome, saldo, numeroDaConta);
    }
    //Getter and Setter:
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    
}