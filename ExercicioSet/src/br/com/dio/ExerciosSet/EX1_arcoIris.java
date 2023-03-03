package br.com.dio.ExerciosSet;

import java.util.*;

public class EX1_arcoIris {
    public static void main(String[] args) {

        //Crie um conjunto contendo as cores dos arco iris

        System.out.println("Crie um conjunto e adicione as cores: ");
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(arcoIris.toString());

        System.out.println("Exiba as cores uma em baixo da outra: ");
        for (String cor : arcoIris) System.out.println(cor);

        System.out.println("Exiba a quantidade de cores: " + arcoIris.size());

        System.out.println("Exiba as cores em ordem alfabetica: ");
        Set<String> cores = new TreeSet<>(arcoIris);
        System.out.println(cores);

        System.out.println("Exiba as cores na ordem inversa que foram adicionadas");
        Set<String> arcoIris2 = new LinkedHashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(arcoIris2);
        List<String> coresArcoIrisList = new ArrayList<>(arcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra V: ");
        for (String arcoIris3 : arcoIris) {
            if (arcoIris3.startsWith("v")) System.out.println(arcoIris3);
        }

        System.out.println("Remova todas as cores que não começam com a letra V: ");
        Iterator<String> iterator1 = arcoIris.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(arcoIris);

        System.out.println("Limpe o cojunto: ");
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
    }
    }

