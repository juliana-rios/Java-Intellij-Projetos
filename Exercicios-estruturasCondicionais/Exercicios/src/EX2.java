//Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
//estado civil seja “CASADA”, solicitar o tempo de casada (anos).

import java.util.Objects;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();
        System.out.println("Digite o seu sexo: (F para feminino e M para Masculino) ");
        String sexo = scan.next();
        System.out.println("Digite o seu estado civil: ");
        String estadoCivil = scan.next();

        if (Objects.equals(estadoCivil, "Casada") && Objects.equals(sexo, "F")){
            System.out.println("Qual o seu tempo de casado? ");
            int tempoCasada = scan.nextInt();
        }else System.out.println("Programa encerrado");
    }
}
