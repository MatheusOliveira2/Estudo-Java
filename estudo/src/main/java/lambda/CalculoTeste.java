package lambda;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo soma = new Somar();
        System.out.println(soma.executar(2, 3));
        
        Calculo multiplca = new Multiplicar();
        System.out.println(multiplca.executar(2, 3));

    }
}
