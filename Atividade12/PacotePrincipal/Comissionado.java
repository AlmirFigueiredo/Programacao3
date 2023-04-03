package Atividade12.PacotePrincipal;

public class Comissionado extends Empregado {
    private double totalVenda;
    private double taxaComissao;
    
    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(nome,sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }
    public double vecimento() {
        return (this.totalVenda * taxaComissao);
    }
}
