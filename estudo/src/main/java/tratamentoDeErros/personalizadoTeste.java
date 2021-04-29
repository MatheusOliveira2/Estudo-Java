package tratamentoDeErros;

import tratamentoDeErros.personalizada.NumeroNegativoException;

public class personalizadoTeste {
    public static void main(String[] args) {
        teste(1);
        try {
            teste(-1);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }

    static void teste(Integer n){
        if(n < 0){
            throw new NumeroNegativoException(n.toString());
        }
        else{
            System.out.println(n);
        }
    }
}
