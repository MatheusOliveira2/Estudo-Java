package tratamentoDeErros;

import tratamentoDeErros.personalizada.NumeroNegativoException;

public class personalizadoTeste {
    public static void main(String[] args) {
        
        try {
            teste(1);
            teste(-1);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("oi");
        }

        System.out.println("Fim");
    }

    static void teste(Integer n) throws NumeroNegativoException{
        if(n < 0){
            throw new NumeroNegativoException(n.toString());
        }
        else{
            System.out.println(n);
        }
    }
}
