package composicao.desafio;

import java.util.ArrayList;

public class Item {
    
    private double quantidade;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Item(double quantidade){
        this.quantidade = quantidade;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public double getValorItens(){
        double valor = 0;
        for (Produto produto : produtos) {
            valor += produto.getValor();
        }

        return valor * quantidade;
    }

    protected void listarProdutos(){
        System.out.println("Quantidade: " + this.quantidade);
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}
