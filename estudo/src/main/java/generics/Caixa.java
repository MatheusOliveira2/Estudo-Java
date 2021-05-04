package generics;

public class Caixa<T> {
    private T nome;

    public Caixa(T nome){
        this.nome = nome;
    }

    public T getNome() {
        return nome;
    }
}
