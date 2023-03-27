package Atividade8.PacotePrincipal;

import java.util.Scanner;

import Atividade8.PacoteInterno.DiasDaSemana;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DiasDaSemana diaSelecionado;
        System.out.println("Escolha a opcao que representa o dia da semana:");
        while(true) {
            System.out.println("(0)Encerrar programa\n(1)Domingo\n(2)Segunda-feira\n(3)Terca-feira\n(4)Quarta-feira\n(5)Quinta-feira\n(6)Sexta-feira\n(7)Sabado");
            int day = input.nextInt();
            switch(day) {
                case 0: System.out.println("Programa encerrado!");
                        System.exit(0);
                
                case 1: 
                        diaSelecionado = DiasDaSemana.Domingo;
                        System.out.println("O banco não abre aos domingos, tente em outro dia!");
                        break;
                case 2:  
                        diaSelecionado = DiasDaSemana.Segunda;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                case 3: 
                        diaSelecionado = DiasDaSemana.Terca;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                case 4:
                        diaSelecionado = DiasDaSemana.Quarta;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                case 5:
                        diaSelecionado = DiasDaSemana.Quinta;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                case 6: 
                        diaSelecionado = DiasDaSemana.Sexta;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                case 7:
                        diaSelecionado = DiasDaSemana.Sabado;
                        System.out.println("O banco esta aberto, horario de funcionamento normal!");
                        break;
                default:
                        System.out.println("Opcao invalida!");
                        System.out.println("Digite uma opcao valida:");
                        day = input.nextInt();
            }
            if(!(day > 7 || day < 0)) {
                break;
            }
        }
        System.out.println("Selecione a opcao que deseja:");
        int option = input.nextInt();
        showMainOptions();
        while(true) {
            switch(option) {
                case 0:
                case 1:
                case 2:
                case 3: System.out.println("Programa encerrado!");
                        System.exit(0);
                default: System.out.println("Digite uma opcao valida!!");



            }
            if(!(option > 4 || option < 1)) {
                break;
            }
        }




        input.close();
    }
    public static void showMainOptions() {
        System.out.println("(0)Criar conta no banco\n(1)Depositar\n(2)Sacar\n(3)Encerrar programa");
    }
    public static void showDaysOptions() {
        System.out.println("(0)Encerrar programa\n(1)Domingo\n(2)Segunda-feira\n(3)Terca-feira\n(4)Quarta-feira\n(5)Quinta-feira\n(6)Sexta-feira\n(7)Sabado");
    }
}
