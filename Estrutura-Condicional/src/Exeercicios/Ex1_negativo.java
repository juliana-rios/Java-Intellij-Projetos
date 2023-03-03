package Exeercicios;

import java.util.Scanner;

public class Ex1_negativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;

        System.out.println("Digitte um número: ");
        num = scan.nextDouble();

        if (num < 0){
            System.out.println("O número " + num + " é negativo.");
        } else {
            System.out.println("O número " + num + " é positivo.");
        }
    }




}
