package composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private int idade;
    private ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirNotaDeCompras(){        
        System.out.println("Detalhes da compra");
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");
        
        for (int i = 0; i < compras.size(); i++) {
            System.out.println("Compra:" + (i+1));
            compras.get(i).detalharCompra();
        }

        System.out.println("Valor Total: R$" + this.getValorTotalCompras());
    }

    public double getValorTotalCompras(){
        double valor = 0;
        for (Compra compra : compras) {
            valor += compra.getTotalCompra();
        }

        return valor;
    }
    
    public void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
}
