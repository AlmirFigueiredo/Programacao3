package Atividade9.PacotePrincipal;

import java.util.Scanner;

import Atividade9.PacoteInterno.ContaEspecial;
import Atividade9.PacoteInterno.ContaPoupanca;
import Atividade9.PacoteInterno.Contas;

public class Main {
    public static double tax = 1/100;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contas brasilBank = new Contas();
        System.out.println("Bem vindo ao brasilBank!");
        int contaOption, diaRendimento;
        String nome, numeroDaConta;
        while(true) {
            showMainOptions();
            int mainOption = input.nextInt();
            switch(mainOption) {
                case 1: System.out.println("Digite qual tipo de conta voce deseja criar:");
                        showSecondOptions();
                        contaOption = input.nextInt();
                        if(contaOption == 1) {
                            input.nextLine();
                            System.out.println("Digite o seu nome completo:");
                            nome = input.nextLine();
                            ContaEspecial conta = new ContaEspecial(nome);
                            brasilBank.IncluirContaEspecial(conta);;
                            System.out.println("Conta cadastrada com sucesso!");
                            System.out.printf("O numero da sua conta bancaria e: %s\n", conta.getNumeroDaConta());
                            System.out.println("Para depositar um valor inicial, acesse a aba 'depositar'");
                        } else if(contaOption == 2) {
                            input.nextLine();
                            System.out.println("Digite o seu nome completo:");
                            nome = input.nextLine();
                            System.out.println("Digite o dia de hoje (apenas o dia do mes):");
                            diaRendimento = input.nextInt();
                            ContaPoupanca conta = new ContaPoupanca(nome, diaRendimento);
                            brasilBank.IncluirContaPoupanca(conta);
                            System.out.println("Conta cadastrada!");
                        } else {
                            System.out.println("Opcao invalida!");
                        }

                        break;
                case 2: System.out.println("Deseja realizar saque de qual tipo de conta?");
                        showSecondOptions();
                        contaOption = input.nextInt();
                        if(contaOption == 1) {
                            input.nextLine();
                            System.out.println("Digite o seu nome completo:");
                            nome = input.nextLine();
                            System.out.println("Digite o numero da sua conta:");
                            numeroDaConta = input.nextLine();
                            ContaEspecial conta = brasilBank.encontrarContaEspecial(nome, numeroDaConta);
                            if(conta == null) {
                                System.out.println("Conta nao encontrada!");
                            } else {
                                System.out.println("Conta encontrada, digite o valor que deseja sacar:");
                                double saque = input.nextDouble();
                                brasilBank.sacarContaEspecial(saque, conta);

                            }

                        } else if(contaOption == 2) {
                            input.nextLine();
                            System.out.println("Digite o seu nome completo:");
                            nome = input.nextLine();
                            System.out.println("Digite o numero da sua conta:");
                            numeroDaConta = input.nextLine();
                            ContaPoupanca conta = brasilBank.encontrarContaPoupanca(nome, numeroDaConta);
                            if(conta == null) {
                                System.out.println("Conta nao encontrada!!");
                            } else {
                                System.out.println("Conta encontrada, digite o valor que deseja sacar:");
                                double saque = input.nextDouble();
                                brasilBank.sacarContaPoupanca(saque, conta);
                                
                            }
                        } else {
                            System.out.println("Opcao invalida!!");
                        }
                        break; 
                case 3: 
                        break;
                case 4: System.out.println("Digite o dia de hoje:");
                        diaRendimento = input.nextInt();
                        brasilBank.atualizarContasPoupanca(diaRendimento, tax);
                        break;

                case 5: System.out.println("=============Contas Especiais=============");
                        brasilBank.mostrarSaldoDasContasEspeciais();
                        System.out.println("============================================");
                        System.out.println("===============Contas Poupanca===============");
                        brasilBank.mostrarSaldoDasContasPoupanca();
                        break;

                case 6: break;
                default: System.out.println("Opcao invalida!");
            }
            if(mainOption == 6) {
                break;
            }




        }
        System.out.println("Programa encerrado!");
        input.close();
    }
    public static void showMainOptions() {
        System.out.println("Digite a opcao que deseja:");
        System.out.println("1)Incluir uma nova conta\n2)Sacar\n3)Depositar\n4)Atualizar o valor das poupancas");
        System.out.println("5)Mostrar saldo de todas as contas\n6)Encerrar programa");
    }
    public static void showSecondOptions() {
        System.out.println("1)Conta Especial\n2)Conta Poupanca");
    }
}