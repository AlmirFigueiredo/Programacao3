package Atividade11.PacoteInterno;

public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;
    public ContaPoupanca(String nome, int dia) {
        super(nome);
        this.diaDeRendimento = dia;
    }
    //Getter and Setter:
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof ContaPoupanca)) {
            return false;
        }
        ContaPoupanca conta = (ContaPoupanca)obj;
        return this.getNomeDoCliente().equals(conta.getNomeDoCliente()) && this.getNumeroDaConta().equals(conta.getNumeroDaConta());
    }
    
}