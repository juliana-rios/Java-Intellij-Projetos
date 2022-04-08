public class Quadrilatero {
        public static void area(double lado){

            System.out.println("Área do Quadrado: " + lado*lado);
        }
        public static void area(double lado1, double lado2){

            System.out.println("Área do Triangulo: " + lado1*lado2);
        }
        public static void area(double baseMaior, double baseMenor, double altura){
            System.out.println("Área trapézio: " + ((baseMaior+baseMenor)*altura) / 2 );
        }
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do Retangulo: " + (diagonal1*diagonal2) / 2);
    }
}
