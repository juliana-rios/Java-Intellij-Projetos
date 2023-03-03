import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Teste {

    public static int makeChange(int centavos){
    Set<Integer> cents = new HashSet<>(Arrays.asList(25, 10, 5, 1));



        return centavos;
    }

    public static void main(String[] args) {
        int n = 12;

        System.out.println(makeChange(n));

    }
}
