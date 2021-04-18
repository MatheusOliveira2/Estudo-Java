package composicao.desafio;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("matheus", 22);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        Item item1 = new Item(1);
        
        Produto produto1 = new Produto("Caneta", 2);
        Produto produto2 = new Produto("Lapis", 4);
        Produto produto3 = new Produto("Borracha", 1);

        item1.addProduto(produto1);
        item1.addProduto(produto2);
        item1.addProduto(produto3);

        Item item2 = new Item(1);
        
        Produto produto4 = new Produto("Arroz", 22);
        Produto produto5 = new Produto("Feijao", 10);
        Produto produto6 = new Produto("Frango", 12);

        item2.addProduto(produto4);
        item2.addProduto(produto5);
        item2.addProduto(produto6);
        item2.addProduto(produto1);

        compra1.addItem(item1);
        compra1.addItem(item2);

        compra2.addItem(item2);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

       cliente1.emitirNotaDeCompras(); 
        


    }
}
