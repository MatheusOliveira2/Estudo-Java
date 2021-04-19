package heranca.desafio;

public class Carro {
    private int velocidadeAtual;

    public Carro(){
        this.velocidadeAtual = 0;
    };


    public void Acelerar(Aceleracao aceleracao){
        if(aceleracao == Aceleracao.NORMAL)
            this.velocidadeAtual += 5;
        else if(aceleracao == Aceleracao.FORTE)
            this.velocidadeAtual += 10;
    }

    public void Frear(){
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
