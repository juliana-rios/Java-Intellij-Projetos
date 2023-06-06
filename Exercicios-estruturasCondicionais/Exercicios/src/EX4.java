//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se 
//somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se 
//atribuir o resultado para uma variável C e mostrar seu conteúdo na tela. 

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = 0;
        
        System.out.println("Digite um número: ");
        int A = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int B = scan.nextInt();
        
        if (A == B){
          C = A + B;  
        }else {
            C= A * B;
        }
        System.out.println(C);
    }
}
