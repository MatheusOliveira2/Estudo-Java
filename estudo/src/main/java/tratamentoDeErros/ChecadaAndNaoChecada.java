package tratamentoDeErros;

public class ChecadaAndNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
            geraErro2(); 
        } catch (Exception e) {
            //TODO: handle exception
        }

        System.out.println("Fim!!");
    }

    static void geraErro1(){
       throw new RuntimeException("Errei");
    }

    static void geraErro2() throws Exception{
       throw new Exception("Errei - 2");
    }

}
