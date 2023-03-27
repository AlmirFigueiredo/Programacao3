package Atividade8.PacotePrincipal;

import java.util.Scanner;

import Atividade8.PacoteInterno.DiasDaSemana;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opcao que representa o dia da semana:");
        System.out.println("(0)Encerrar programa\n(1)Domingo\n(2)Segunda-feira\n(3)Terca-feira\n(4)Quarta-feira\n(5)Quinta-feira\n(6)Sexta-feira\n(7)Sabado");
        int day = input.nextInt();
        DiasDaSemana diaSelecionado;
        while(true) {
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
            }
            if(!(day > 7 || day < 0)) {
                break;
            }
        }
        



        input.close();
    }
    public static void showMainOptions() {
        System.out.println("");
    }
}
