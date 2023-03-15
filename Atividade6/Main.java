package Atividade6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Digite os coeficientes do ponto C (centro do circulo)->");
            System.out.print("Coeficiente a: ");
            double aC = input.nextDouble();
            System.out.print("\nCoeficiente b: ");
            double bC = input.nextDouble();
            System.out.print("\nCoeficiente c: ");
            double cC = input.nextDouble();
            System.out.print("\nDigite o raio da circunferencia: ");
            double rC = input.nextDouble();
            Circle c = new Circle(rC, aC, bC, cC);

            System.out.println("\nDigite os coeficientes do ponto que deseja comparar:");
            System.out.print("Coeficiente a: ");
            double aP = input.nextDouble();
            System.out.print("\nCoeficiente b: ");
            double bP = input.nextDouble();
            System.out.print("\nCoeficiente c: ");
            double cP = input.nextDouble();
            Points p = new Points(aP, bP, cP, c);
            double distanceAmong = p.getDistance();
            System.out.printf("\nA distancia entre os pontos é de: %.2f\n", distanceAmong);
            System.out.println("===========================================================================");
            System.out.println("O ponto esta dentro da circunferencia?");
            if(p.getIsPointInCircle()) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
            System.out.println("===========================================================================");
            System.out.println("O raio é maior que a distancia entre os pontos?");
            if(p.getIsRBigger()) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
            System.out.println("===========================================================================");
            System.out.println("O raio é menor que a distancia entre os pontos?");
            if(p.getIsRSmaller()) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
            System.out.println("===========================================================================");
            System.out.println("O raio é igual a distanca entre os pontos?");
            if(p.getIsEqual()) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
            System.out.println("===========================================================================");
            System.out.println("Deseja realizar outra comparacao?");
            char option = input.next().toUpperCase().trim().charAt(0);
            if(option == 'N') {
                break;
            }
        }
        input.close();
    }
}