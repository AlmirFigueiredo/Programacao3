package Atividade8;

public class Banco extends Conta{
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
        this.contasBancarias = temp;
    }
    
    
}