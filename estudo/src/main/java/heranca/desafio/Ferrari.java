package heranca.desafio;

public class Ferrari extends Carro {
    public Ferrari(){
        super();
    }

    @Override
    public void acelerar(Aceleracao aceleracao){
        if(aceleracao == Aceleracao.NORMAL)
            this.velocidadeAtual += 10;
        else if(aceleracao == Aceleracao.FORTE)
        this.velocidadeAtual += 15;
    }
}
