package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
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

        BinaryOperator<Double> media = (a,b) -> (a+b)/2;

        BiFunction<Double, Double, String> resultado = (a,b)->{
            double notaFinal = (a+b)/2;
            return notaFinal >= 7? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(5.0, 8.0));

        Function<Double, String> conceito = n -> n >= 7? "Aprovado" : "Reprovado"; 
        
        System.out.println(media.andThen(conceito).apply(10D, 10D));
    }
}
