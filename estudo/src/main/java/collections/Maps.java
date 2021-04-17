package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        
        usuarios.put(1, "Joao");

        System.out.println(usuarios.entrySet());

    }
}
