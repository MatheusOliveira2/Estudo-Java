package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Joao", "Ze", "Pedro");

        for(String nome:aprovados){
            System.out.println(nome);
        }
        aprovados.forEach(nome -> System.out.println(nome));
    
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }

}
