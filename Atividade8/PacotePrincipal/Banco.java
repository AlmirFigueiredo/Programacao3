package Atividade8.PacotePrincipal;

public class Banco{
    private Conta[] contasBancarias;
    private int quantidadeContas;

    public Banco() {
        this.quantidadeContas = 0;
        this.contasBancarias = new Conta[0];
    }
    public void adicionarConta(Conta novaConta) {
        Conta[] temp = new Conta[this.quantidadeContas+1];
        for(int i = 0; i < this.quantidadeContas; i++) {
            temp[i] = this.contasBancarias[i];
        }
        this.quantidadeContas++;
        this.contasBancarias = temp;
    }
    public void removerConta(String numeroDaConta, String cpf) {
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(contasBancarias[i].cpf.equals(cpf) && contasBancarias[i].numeroDaConta.equals(numeroDaConta)) {
                this.contasBancarias[i] = null;
                this.quantidadeContas--;
            }
        }
    }
    public void depositar(double valor, Conta conta) {
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(this.contasBancarias[i].equals(conta)) {
                this.contasBancarias[i].saldo += valor;
            }
        }
    }
    public void sacar(double valor, Conta conta) {
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(this.contasBancarias[i].equals(conta)) {
                this.contasBancarias[i].saldo -= valor;
            }
        }
    }
    
}