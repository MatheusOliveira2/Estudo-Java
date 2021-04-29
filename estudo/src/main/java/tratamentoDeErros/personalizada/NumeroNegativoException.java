package tratamentoDeErros.personalizada;

public class NumeroNegativoException extends Exception {

    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage(){
        return String.format("O atributo %s está negativo", this.nomeDoAtributo);
    }
}
