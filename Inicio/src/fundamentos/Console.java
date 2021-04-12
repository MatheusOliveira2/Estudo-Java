package src.fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.println("Oi");
        Scanner teste = new Scanner(System.in);
        String  nome = teste.nextLine();
        System.out.println(nome);
        teste.close();

        // Wrappers
        Byte b = 1;
        Integer a = 500;
        Character d = 'd';
    }
}
