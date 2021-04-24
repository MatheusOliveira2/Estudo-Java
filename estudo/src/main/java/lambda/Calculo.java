package lambda;

@FunctionalInterface
public interface Calculo {
    
    double executar(double a , double b );

    default String teste(){
        return "Teste";
    }

    static String testeDois(){
        return "TesteDois";
    }
}
