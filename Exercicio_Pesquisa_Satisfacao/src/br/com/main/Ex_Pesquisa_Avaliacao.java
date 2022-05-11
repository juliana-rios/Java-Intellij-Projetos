package br.com.main;

import java.util.Scanner;

public class Ex_Pesquisa_Avaliacao {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int cont = 0, promotores = 0, detratores = 0, neutras = 0, idade,opniao;
        float somaIdadePro = 0;

        while (cont <=99) {


            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();
            System.out.println("Qual é a probabilidade de você indicar o filme a um amigo ou colega? ");
            System.out.println("Digite a sua nota de 0 a 10: \nSendo de 0 a 6 Péssimo | 7 e 8 Resoavel | 9 e 10 Ótimo ");
            opniao = scan.nextInt();
            cont = cont + 1;



            if (opniao <= 6) detratores = detratores +1;

            if (opniao == 7 || opniao == 8) neutras = neutras +1;

            if (opniao == 9 || opniao == 10){
                promotores = promotores +1;
                somaIdadePro = somaIdadePro + idade;
            }

        }

        System.out.println("A quantidade de Detratores é: " + detratores);
        System.out.println("A quantidade de Passivos/Neutros é: " + neutras);
        System.out.println("A quantidade de Promotores é: " + promotores);
        System.out.println("A média de idade dos Promotores é: " + somaIdadePro/promotores);

    }
}
