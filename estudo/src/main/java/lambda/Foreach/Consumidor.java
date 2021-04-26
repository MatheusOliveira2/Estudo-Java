package lambda.Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<String> imprimir = valor -> System.out.println(valor);

        imprimir.accept("teste");

        List<String> produtos = Arrays.asList("joao", "ze", "matheus");

        produtos.forEach(i -> imprimir.accept(i));
        produtos.forEach(imprimir);
    }
}
