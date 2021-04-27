package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Fornecedor {
    public static void main(String[] args) {
        
        Supplier<List<String>> lista = () -> Arrays.asList("A", "B", "C");

        System.out.println(lista.get());

        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> xDois = n -> n*2;
        UnaryOperator<Integer> aoQuadrado = n -> n*n;

        System.out.println(maisDois.andThen(xDois.andThen(aoQuadrado)).apply(1)); 
        
    }
}
