package stream;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);

        numeros.stream().map(num -> num*2).forEach(System.out::println);
    }
}
