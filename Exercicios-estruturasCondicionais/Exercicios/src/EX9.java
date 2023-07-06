//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, utilizando as seguintes fórmulas:
//● para homens: (72.7 * h) – 58;
//● para mulheres: (62.1 * h) – 44.7.


import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double calculo;

        System.out.println("Digite seu sexo: F ou M");
        String sexo = scan.next();
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();

        if(sexo.equals("F")){

            calculo = (62.1 *altura) - 44.7;
        }else{
            calculo = (72.7 *altura) - 58;
        }

        System.out.printf("Seu peso ideal é: %.2f" + calculo);
    }
}

