package Atividade6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            

            System.out.println("Deseja realizar outra comparacao?");
            char option = input.next().toUpperCase().trim().charAt(0);
            if(option == 'N') {
                break;
            }
        }


        input.close();
    }
}