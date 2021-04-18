package composicao.desafio;

import java.util.ArrayList;

public class Compra {
    
    private ArrayList<Item> itens = new ArrayList<>();

    public void addItem(Item item){
        this.itens.add(item);
    }

    public double getTotalCompra(){
        double valor = 0;
        
        for (Item item : itens) {
            valor += item.getValorItens();
        }
        return valor;
    }

    protected void detalharCompra(){
        for (int i = 0; i < itens.size(); i++) {
            System.out.println("Item: " + (i+1));
            itens.get(i).listarProdutos();    
        }
    }
}
