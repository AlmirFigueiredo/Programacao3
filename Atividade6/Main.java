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
            Circle c = new Circle(rC, aC, bC, rC);

            System.out.println("Digite os coeficientes do ponto que deseja comparar:");
            System.out.print("Coeficiente a: ");
            double aP = input.nextDouble();
            System.out.print("\nCoeficiente b: ");
            double bP = input.nextDouble();
            System.out.print("\nCoeficiente c: ");
            double cP = input.nextDouble();
            Points p = new Points(aP, bP, cP, c);
            double distanceAmong = p.getDistance();
            System.out.printf("\nA distancia entre os pontos é de: %.2f\n", distanceAmong);
            


            

            System.out.println("Deseja realizar outra comparacao?");
            char option = input.next().toUpperCase().trim().charAt(0);
            if(option == 'N') {
                break;
            }
        }


        input.close();
    }
}