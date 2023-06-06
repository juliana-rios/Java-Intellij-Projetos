// Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são
//VERDADEIROS ou FALSOS.

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: (true/false)");
        boolean numero1 = scan.nextBoolean();
        System.out.println("Digite o segundo valor: (true/false)");
        boolean numero2 = scan.nextBoolean();

        if (numero1 && numero2){
            System.out.println("Os numeros são verdadeiros!");
        }else if (!numero1 && !numero2){
            System.out.println("Os numeros são falsos");
        }else {
            System.out.println("Os números são diferentes");
        }
    }
}
