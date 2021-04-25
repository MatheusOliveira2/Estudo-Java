package lambda;

import java.util.function.BinaryOperator;

public class TesteCalculo3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x , y) -> x + y;
        System.out.println(calc.apply(2D, 3D));
    }
}
