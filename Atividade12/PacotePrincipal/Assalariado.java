package Atividade12.PacotePrincipal;

class Assalariado extends Empregado {
    private double salario;
    public Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
    public double vecimento() {
        return this.salario;
    }
}
