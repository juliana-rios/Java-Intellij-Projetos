//Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem
//decrescente.

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = scan.nextInt();

        if(numero1 < numero2){
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        if (numero2 < numero3){
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 < numero2){
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        System.out.println(" " + numero1 + " " + numero2 + " " + numero3);
    }
}
