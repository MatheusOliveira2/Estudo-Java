package tratamentoDeErros;

public class Aluno {
    public String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void metodo1(){
        System.out.println("metodo 01");
        try {
            this.metodo2();
        } catch (Exception e) {
            System.out.println("Tratou o erro");
        }
    }

    public void metodo2() throws Exception{
        System.out.println("Metodo 2");
        
        this.metodo3();
        System.out.println("alo");


    }

    public void metodo3 () throws Exception{
        throw new Exception("Excessão metodo 3");
    }


    
}
