package lambda.Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Joao", "Pedro","Jose", "Matheus");

        for(String nome: aprovados){
            System.out.println(nome);
        }

        aprovados.forEach(nome -> {
            System.out.println(nome);
        });

        // Method Reference
        aprovados.forEach(System.out::println);


        aprovados.forEach(nome -> meuImprimir(nome));
        
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome){
        System.out.println(nome);
    }
}
