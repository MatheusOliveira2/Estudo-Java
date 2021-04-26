package lambda.Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<String> imprimir = valor -> System.out.println(valor);

        imprimir.accept("teste");

        List<String> produtos = Arrays.asList("joao", "ze", "matheus");

        produtos.forEach(i -> imprimir.accept(i));
        produtos.forEach(imprimir);




        Function<Double, Integer> funcao = (a) -> {
            return (int)(a*0.5);
        };

        Function<Integer, String> resultado = numero -> {
            return "O resultado é: " + numero;
        };

        System.out.println(funcao.andThen(resultado).apply(23.0)); 


    }
}
