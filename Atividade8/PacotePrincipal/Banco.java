package Atividade8.PacotePrincipal;

public class Banco{
    private Conta[] contasBancarias;
    private int quantidadeContas;

    public Banco() {
        this.quantidadeContas = 0;
        this.contasBancarias = new Conta[0];
    }
    public int getQuantidadeContas() {
        return quantidadeContas;
    }
    public void adicionarConta(Conta novaConta) {
        Conta[] temp = new Conta[this.quantidadeContas+1];
        for(int i = 0; i < this.quantidadeContas; i++) {
            temp[i] = this.contasBancarias[i];
        }
        this.quantidadeContas++;
        this.contasBancarias = temp;
    }

    public void depositar(double valor, Conta conta) {
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(this.contasBancarias[i].equals(conta)) {
                this.contasBancarias[i].modificarSaldo(valor);;
            }
        }
    }
    public void sacar(double valor, Conta conta) {
        valor *= -1;
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(this.contasBancarias[i].equals(conta)) {
                this.contasBancarias[i].modificarSaldo(valor);;
            }
        }
    }

    public Conta AcharConta(String cpf, String numeroDaConta) {
        for(int i = 0; i < this.quantidadeContas; i++) {
            if(this.contasBancarias[i].cpf.equals(cpf) && this.contasBancarias[i].numeroDaConta.equals(numeroDaConta)) {
                return this.contasBancarias[i];
            }
        }
        Conta conta = new Conta();
        return conta;
    }
    
}