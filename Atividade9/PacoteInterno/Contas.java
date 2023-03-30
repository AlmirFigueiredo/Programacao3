package Atividade9.PacoteInterno;

public class Contas {
    private ContaEspecial[] listaDeContasEspeciais;
    private ContaPoupanca[] listaDeContasPoupanca;
    private int quantidadeDeContasEspeciais;
    private int quantidadeDeContasPoupanca;

    public Contas() {
        this.quantidadeDeContasEspeciais = 0;
        this.quantidadeDeContasPoupanca = 0;
        this.listaDeContasEspeciais = new ContaEspecial[this.quantidadeDeContasEspeciais];
        this.listaDeContasPoupanca = new ContaPoupanca[this.quantidadeDeContasPoupanca];
    }
    public void IncluirContaPoupanca(ContaPoupanca conta) {
        ContaPoupanca[] temp = new ContaPoupanca[this.quantidadeDeContasPoupanca+1];
        int i;
        for(i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            temp[i] = this.listaDeContasPoupanca[i];
        }
        temp[i] = conta;
        this.listaDeContasPoupanca = temp;
    }
    public void IncluirContaEspecial(ContaEspecial conta) {
        ContaEspecial[] temp = new ContaEspecial[this.quantidadeDeContasEspeciais + 1];
        int i;
        for(i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            temp[i] = this.listaDeContasEspeciais[i];
        }
        temp[i] = conta;
        this.listaDeContasEspeciais = temp;
    }
    public void sacarContaPoupanca(double valor, ContaPoupanca poupanca) {
        for(int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            this.listaDeContasPoupanca[i].equals(poupanca);
        }
    }
    


}
