import java.util.Scanner;

// Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
//imprimir o resultado desta operação.
public class EX7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma;
        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();

        if (numero1 % 2 == 0){
            soma = 5 + numero1;
        }else {
            soma = 8 + numero1;
        }

        System.out.println(soma);
    }
}
