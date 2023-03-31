package Atividade10.PacoteInterno;

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
                if(poupanca.getSaldo()-valor < 0) {
                    System.out.println("Saldo insuficiente!");
                    return;
                }
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
                if(conta.getLimite() - valor < 0) {
                    System.out.println("Limite excedido!!");
                    return;
                }
                double saldoAnterior = this.listaDeContasEspeciais[i].getSaldo();
                this.listaDeContasEspeciais[i].setSaldo(saldoAnterior-valor);
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
                this.listaDeContasEspeciais[i].setSaldo(saldoAnterior+valor);
                this.listaDeContasEspeciais[i].setLimite((saldoAnterior+valor)*1.2);
                return;
            }
        }
        System.out.println("Conta nao encontrada!");
    }
    public void atualizarContasPoupanca(int dia, double taxa) {
        for(int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            if(this.listaDeContasPoupanca[i].getDiaDeRendimento() == dia) {
                this.listaDeContasPoupanca[i].incrementarSaldo(taxa);
            }
        }
        System.out.println("Contas atualizadas!");
    }
    public void mostrarSaldoDasContasPoupanca() {
        if(this.quantidadeDeContasPoupanca == 0) {
            System.out.println("Nao ha contas cadastradas!");
            return;
        }
        for(int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            String nome = this.listaDeContasPoupanca[i].getNomeDoCliente();
            String conta = this.listaDeContasPoupanca[i].getNumeroDaConta();
            double saldo = this.listaDeContasPoupanca[i].getSaldo();
            System.out.printf("Nome: %s || Conta: %s || Saldo: %.2f\n", nome, conta, saldo);
        }
    }
    public void mostrarSaldoDasContasEspeciais() {
        if(this.quantidadeDeContasEspeciais == 0) {
            System.out.println("Nao ha contas cadastradas!");
            return;
        }
        for(int i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            String nome = this.listaDeContasEspeciais[i].getNomeDoCliente();
            String conta = this.listaDeContasEspeciais[i].getNumeroDaConta();
            double saldo = this.listaDeContasEspeciais[i].getSaldo();
            System.out.printf("Nome: %s || Conta: %s || Saldo: %.2f\n", nome, conta, saldo);
        }
    }
    public ContaEspecial encontrarContaEspecial(String nome, String numeroDaConta) {
        for(int i = 0; i < this.quantidadeDeContasEspeciais; i++) {
            if(this.listaDeContasEspeciais[i].getNumeroDaConta().equals(numeroDaConta) && this.listaDeContasEspeciais[i].getNomeDoCliente().equals(nome)) {
                return this.listaDeContasEspeciais[i];
            }
        }
        System.out.println("Conta nao encontrada!");
        return null;
    }
    public ContaPoupanca encontrarContaPoupanca(String nome, String numeroDaConta) {
        for(int i = 0; i < this.quantidadeDeContasPoupanca; i++) {
            if(this.listaDeContasPoupanca[i].getNomeDoCliente().equals(nome) && this.listaDeContasPoupanca[i].getNumeroDaConta().equals(numeroDaConta)) {
                return this.listaDeContasPoupanca[i];
            }
        }
        return null;
    }
}
