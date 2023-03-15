package Atividade6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Digite o ponto C (centro do circulo):");
            
            System.out.println("Digite os coeficientes relacionados com as coordenadas->");
            System.out.print("Coeficiente a: ");
            double aC = input.nextDouble();
            System.out.print("\nCoeficiente b: ");
            double bC = input.nextDouble();
            System.out.print("\nCoeficiente c: ");
            double cC = input.nextDouble();

            





            System.out.println("\nEixo Vertical: ");
            double yC = input.nextDouble();
            System.out.print("\nDigite o raio da circunferencia:");
            double r = input.nextDouble();
            
            System.out.println("\nDigite o ponto que deseja comparar:");


            

            System.out.println("Deseja realizar outra comparacao?");
            char option = input.next().toUpperCase().trim().charAt(0);
            if(option == 'N') {
                break;
            }
        }


        input.close();
    }
}