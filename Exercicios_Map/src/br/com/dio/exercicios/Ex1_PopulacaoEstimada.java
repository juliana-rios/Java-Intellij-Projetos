package br.com.dio.exercicios;

import java.util.*;

public class Ex1_PopulacaoEstimada {
    public static void main(String[] args) {
        Map<String, Integer> populacaoEstados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados);

        System.out.println("\nSubstitua a população do estado do RN por 3534165");
        populacaoEstados.put("RN", 3534165);
        System.out.println(populacaoEstados);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populacaoEstados.put("PB", 4039277);
        System.out.println(populacaoEstados);

        System.out.println("\nExiba a populaçao de PE: " + populacaoEstados.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstados1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstados1);

        System.out.println("\nExiba o estado e sua população por ordem alfabética: ");
        Map<String, Integer> populacaoEstados2 = new TreeMap<>(populacaoEstados1);
        System.out.println(populacaoEstados2.toString());

        Collection<Integer> populacao = populacaoEstados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstados.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma/populacaoEstados.size()));

        System.out.println("\nRemova todos os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstados.values().iterator();
        while (iterator1.hasNext()){
        if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstados);

        System.out.println("\nApague o dicionário de estados: ");
        populacaoEstados.clear();
        System.out.println(populacaoEstados);

        System.out.println("\nConfira se dicionário está vazio: " + populacaoEstados.isEmpty());
    }
}
