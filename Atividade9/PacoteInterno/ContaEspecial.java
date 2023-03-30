package Atividade9.PacoteInterno;

public class ContaEspecial extends ContaBancaria {
    private double limite;
    public ContaEspecial(String nome, String numeroDaConta, double saldo, double limite) {
        super(nome, saldo, numeroDaConta);
        this.limite = limite;
    }
    //Getters and setters:
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof ContaEspecial)) {
            return true;
        }
        ContaEspecial conta = (ContaEspecial)obj;
        return this.getNomeDoCliente().equals(conta.getNomeDoCliente()) && this.getNumeroDaConta().equals(conta.getNumeroDaConta());
    }
}
