package lambda.Foreach;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = prod -> prod.preco > 50.00;

        System.out.println(isCaro.test(new Produto("Bolsa", 500, 0.15)));
    }
}
