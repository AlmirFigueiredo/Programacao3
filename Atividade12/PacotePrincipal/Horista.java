package Atividade12.PacotePrincipal;

public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas =horasTrabalhadas;
    }
    public double vencimento() {
        return this.precoHora*this.horasTrabalhadas;
    }
}
