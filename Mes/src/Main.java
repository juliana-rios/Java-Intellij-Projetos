import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes;

        System.out.println("Digite o número referente ao mês: ");
        mes = scan.nextByte();

        if (mes == 1 ){
            System.out.println("Mês de Janeiro");
            System.out.println("Férias!!");
        }else if (mes == 2){
            System.out.println("Mês de Fevereiro");
        }else if (mes == 3){
            System.out.println("Mês de Março");
        }else if (mes == 4){
            System.out.println("Mês de Abril");
        }else if (mes == 5){
            System.out.println("Mês de Maio");
        }else if (mes == 6){
            System.out.println("Mês de Junho");
        }else if (mes == 7){
            System.out.println("Mês de Julho");
            System.out.println("Férias!!");
        }else if (mes == 8){
            System.out.println("Mês de Agosto");
        }else if (mes == 9){
            System.out.println("Mês de Setembro");
        }else if (mes == 10){
            System.out.println("Mês de Outubro");
        }else if (mes == 11){
            System.out.println("Mês de Novembro");
        }else if (mes == 12){
            System.out.println("Mês de Dezembro");
            System.out.println("Férias!!");
        }else {
            System.out.println("Opção inválida!!");
        }
    }
}
