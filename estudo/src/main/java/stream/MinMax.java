package stream;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
         
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        

        System.out.println(numeros.stream().max((a, b) -> {
            if(a > b) return 1;
            if(a < b) return -1;
            return 0;
        }).get());

        System.out.println(numeros.stream().min((a, b) -> {
            if(a > b) return 1;
            if(a < b) return -1;
            return 0;
        }).get());


        
    }
}
