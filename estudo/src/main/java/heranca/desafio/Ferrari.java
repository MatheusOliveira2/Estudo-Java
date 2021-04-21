package heranca.desafio;

public class Ferrari extends Carro implements Esportivo {


    private int delta = 10;
    public Ferrari(){
        super();
    }

    @Override
    public void acelerar(Aceleracao aceleracao){
        if(aceleracao == Aceleracao.NORMAL)
            this.velocidadeAtual += delta;
        else if(aceleracao == Aceleracao.FORTE)
        this.velocidadeAtual += delta + 10;
    }

    @Override
    public void ligarTurbo(){
        this.delta += 10;
    }

    @Override
    public void desligarTurbo(){
        this.delta -= 10;
    }
}
