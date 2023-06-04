
//Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.


public class EX1 {
    public static void main(String[] args) {
            int A = 4;
            int B = 6;
            int C = 56;
            int soma;

            soma = A + B;

            if(soma < C){
                System.out.println("Soma de A + B é menor que C");
            }else
                System.out.println("Soma de A + B não é menor que C");

    }
}