package Atividade9.PacotePrincipal;

import java.util.Scanner;

import Atividade9.PacoteInterno.ContaEspecial;
import Atividade9.PacoteInterno.Contas;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contas brasilBank = new Contas();
        System.out.println("Bem vindo ao brasilBank!");
        int contaOption;
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
                            
                        } else if(contaOption == 2) {

                        } else {
                            System.out.println("Opcao invalida!");
                        }

                        break;
                case 2: 
                        break; 
                case 3: 
                        break;
                case 4: 
                        break;
                case 5: 
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