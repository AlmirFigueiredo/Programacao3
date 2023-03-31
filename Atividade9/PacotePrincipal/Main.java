package Atividade9.PacotePrincipal;

import java.util.Scanner;

import Atividade9.PacoteInterno.Contas;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contas brasilBank = new Contas();

        
        
        


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