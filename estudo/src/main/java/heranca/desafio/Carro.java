package heranca.desafio;

public class Carro {
    protected int velocidadeAtual;

    public Carro(){
        this.velocidadeAtual = 0;
    };


    public void acelerar(Aceleracao aceleracao){
        if(aceleracao == Aceleracao.NORMAL)
            this.velocidadeAtual += 5;
        else if(aceleracao == Aceleracao.FORTE)
            this.velocidadeAtual += 10;
    }

    public void frear(){
        if(this.velocidadeAtual >= 5){
            this.velocidadeAtual -= 5;
        }
        else
            this.velocidadeAtual = 0;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }


}
