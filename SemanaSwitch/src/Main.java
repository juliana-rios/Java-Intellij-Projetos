import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String semana;

        System.out.println("Escolha o dia da semana: ");
        System.out.println("Segunda | Terça | Quarta | Quinta | Sexta | Sábado | Domingo");
        semana = scan.next();

        switch (semana){
            case "Segunda":
                System.out.println("Dia 2");
            break;
            case "Terça":
                System.out.println("Dia 3");
            break;
            case "Quarta":
                System.out.println("Dia 4");
            break;
            case "Quinta":
                System.out.println("Dia 5");
            break;
            case "Sexta":
                System.out.println("Dia 6");
            break;
            case "Sabado":
                System.out.println("Dia 7");
            break;
            case "Domingo":
                System.out.println("Dia 1");
            break;
            default:
                System.out.println("Opção inválida!!");
            break;
        }
    }
}
