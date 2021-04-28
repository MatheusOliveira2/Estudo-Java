package stream;

import java.util.Arrays;
import java.util.List;

public class Match {
    public static void main(String[] args) {
         
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        

        System.out.println(numeros.stream().allMatch(n -> n > 5));
        System.out.println(numeros.stream().anyMatch(n -> n > 5));
        System.out.println(numeros.stream().noneMatch(n -> n > 10));
        
    }
}
