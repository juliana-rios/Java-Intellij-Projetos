package br.com.dio.set;

import java.util.*;

public class LinguagemFavorita {
    public static void main(String[] args) {

        System.out.println("\n ---\tOrdem inserção\t---");
        Set<Linguagem> minhasLinguagens = new LinkedHashSet<>() {{
            add(new Linguagem("Java", 1990, "Intellij"));
            add(new Linguagem("C#", 2000, "Visual Studio"));
            add(new Linguagem("Python", 1995, "Pycharm"));
        }};
        for (Linguagem linguagem2: minhasLinguagens) System.out.println(linguagem2.getNome() + " - " +
                linguagem2.getAnoCriacao() + " - " + linguagem2.getIde());

        System.out.println("\n ---\tOrdem natural\t---");
        Set<Linguagem> linguagem3 = new TreeSet<>(minhasLinguagens);
        for (Linguagem linguagem: linguagem3) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoCriacao() + " - " + linguagem.getIde());

        System.out.println("\n ---\tOrdem IDE\t---");
        Set<Linguagem> linguagem4 = new TreeSet<>(new ComparatorIde());
        linguagem4.addAll(minhasLinguagens);
        for (Linguagem linguagem: linguagem4) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoCriacao() + " - " + linguagem.getIde());


        System.out.println("\n--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<Linguagem> linguagem5 = new TreeSet<Linguagem>(new ComparatorAnoCriacaoENome());
        linguagem5.addAll(minhasLinguagens);
        for (Linguagem linguagem : linguagem5) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoCriacao() + " - " + linguagem.getIde());

        System.out.println("\n--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<Linguagem> linguagem6 = new TreeSet<Linguagem>(new ComparatorNomeAnoCriacaoIde());
        linguagem6.addAll(minhasLinguagens);
        for (Linguagem linguagem : linguagem6) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        
    }
}

class Linguagem implements Comparable<Linguagem>{
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public Linguagem(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome) && anoCriacao.equals(linguagem.anoCriacao) && ide.equals(linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }
}

class ComparatorIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoCriacaoENome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoCriacaoIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if (nome != 0) return nome;
        if (anoCriacao != 0) return anoCriacao;
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}