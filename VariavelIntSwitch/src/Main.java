import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 5;

        System.out.println("Digite um número de 1 a 5: ");
        num = scan.nextByte();

        switch (num){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
            break;
            case 4:
                System.out.println("Errado");
            break;
            case 5:
                System.out.println("Talvez");
            break;
            default:
                System.out.println("Valor indefinido");
            break;
                        }
    }
}
