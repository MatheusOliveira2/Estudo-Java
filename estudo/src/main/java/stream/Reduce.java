package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
         
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        BinaryOperator<Integer> acumulator = (a,b) -> a + b;
        
        int inicio= 50;
        System.out.println(numeros.stream().reduce(inicio,acumulator));

        System.out.println(numeros.stream().reduce(inicio,(ac, n) ->{
            return ac += n;
        }));
    }
}
