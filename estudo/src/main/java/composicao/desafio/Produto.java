package composicao.desafio;

public class Produto {
    
    private String nome;
    private double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return this.nome + " R$" + this.valor;
    }
}
