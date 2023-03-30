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

    }

}
