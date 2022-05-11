import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = 0;
        int m = 0;
        String experiencia, sexo;
        int idade;
        float mediaH = 0;
        int quantMedia = 0;
        int idadeF = 0;
        int idadeM = 0;
        int porcentH = 0;
        int porcentMedia = 0;
        int mulherMaior = 0;
        int menorIdade = 0;

        while (true){
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            if (idade <=0) break;
            System.out.println("Digite o Sexo: (F) ou (M)");
            sexo = scan.next();
            if (sexo.equals("F")) idadeF++;
            else idadeM++;
            System.out.println("Digite se possui experiência: (S) ou (N)");
            experiencia = scan.next();

            if (sexo.equals("F")) f++;
            else m++;

            if(sexo.equals("M") || experiencia.equals("S")) {
                quantMedia++;
                mediaH = mediaH + idadeM;
            }
            if (sexo.equals("M") || idade>45) {
                porcentH++;
                porcentMedia = (porcentH/100)*idadeM;
            }
            if (sexo.equals("F") || idade<35) mulherMaior++;
            if (sexo.equals("F") || idadeF < menorIdade) menorIdade = idadeF; ;


        }
        System.out.println("Sexo Feminio: " + f);
        System.out.println("Sexo Masculino: " + m);
        System.out.println("A média de homens com esperiência: " + mediaH/quantMedia);
        System.out.println("A porcentagem de homens com 45 comparado ao total é: " + porcentMedia);
        System.out.println("A quantidade de mulheres com idade abaixo de 35 anos é: " + mulherMaior);
        System.out.println("A menor idade entre as mulheres é: " + menorIdade);
    }

}
