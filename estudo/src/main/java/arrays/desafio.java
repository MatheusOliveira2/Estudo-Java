package arrays;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = entrada.nextDouble();
        }

        double media = 0;

        for (double d : notas) {
            media += d;
        }

        System.out.println(media/qtdNotas);
    }
}
