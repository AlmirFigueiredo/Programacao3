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
        ContaPoupanca[] temp = new ContaPoupanca[this.quantidadeDeContasPoupanca + 1];
        int i;
        for (i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            temp[i] = this.listaDeContasPoupanca[i];
        }
        temp[i] = conta;
        this.quantidadeDeContasPoupanca++;
        this.listaDeContasPoupanca = temp;
    }

    public void IncluirContaEspecial(ContaEspecial conta) {
        ContaEspecial[] temp = new ContaEspecial[this.quantidadeDeContasEspeciais + 1];
        int i;
        for (i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            temp[i] = this.listaDeContasEspeciais[i];
        }
        temp[i] = conta;
        this.quantidadeDeContasEspeciais++;
        this.listaDeContasEspeciais = temp;
    }

    public void sacarContaPoupanca(double valor, ContaPoupanca poupanca) {
        for (int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            if(this.listaDeContasPoupanca[i].equals(poupanca)) {
                double saldoAnterior = this.listaDeContasPoupanca[i].getSaldo();
                this.listaDeContasPoupanca[i].setSaldo(saldoAnterior-valor);
                return;
            }
        }
        System.out.println("Conta nao encontrada!");
    }

    public void sacarContaEspecial(double valor, ContaEspecial conta) {
        for(int i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            if(this.listaDeContasEspeciais[i].equals(conta)) {
                double saldoAnterior = this.listaDeContasEspeciais[i].getSaldo();
                this.listaDeContasPoupanca[i].setSaldo(saldoAnterior-valor);
                return;
            }
        }
        System.out.println("Conta nao encontrada!");
    }
    public void depositarContaPoupanca(double valor, ContaPoupanca poupanca) {
        for (int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            if(this.listaDeContasPoupanca[i].equals(poupanca)) {
                double saldoAnterior = this.listaDeContasPoupanca[i].getSaldo();
                this.listaDeContasPoupanca[i].setSaldo(saldoAnterior+valor);
                return;
            }
        }
        System.out.println("Conta nao encontrada!");
    }
    public void depositarContaEspecial(double valor, ContaEspecial conta) {
        for(int i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            if(this.listaDeContasEspeciais[i].equals(conta)) {
                double saldoAnterior = this.listaDeContasEspeciais[i].getSaldo();
                this.listaDeContasPoupanca[i].setSaldo(saldoAnterior+valor);
                return;
            }
        }
        System.out.println("Conta nao encontrada!");
    }
    public void atualizarContasPoupanca(int dia, double taxa) {
        for(int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            if(this.listaDeContasPoupanca[i].getDiaDeRendimento() == dia) {
                double saldoAnterior = this.listaDeContasPoupanca[i].getSaldo();
                this.listaDeContasPoupanca[i].setSaldo(saldoAnterior*(1+taxa));
            }
        }
        System.out.println("Contas atualizadas!");
    }
}
