package tratamentoDeErros;

public class Basico {
    public static void main(String[] args) {
        //System.out.println(7/0);
        Aluno aluno = null;
        try {
            imprimirNomeDoAluno(aluno);
        } catch (Exception e) {
            System.out.println("Erro tratado");
        }
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }


}
