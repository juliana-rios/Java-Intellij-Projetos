package br.com.dio;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercico 3");
      double areaQuadrado =  QuadrilateroReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

      double areaRetangulo =  QuadrilateroReturn.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(7,8,9);
        System.out.println("Área trapézio: " + areaTrapezio);
    }
}
