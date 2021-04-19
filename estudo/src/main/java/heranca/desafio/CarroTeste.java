package heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car1 = new Ferrari();
        car1.acelerar(Aceleracao.FORTE);
        System.out.println(car1.getVelocidadeAtual());

        Carro car2 = new Civic();
        car2.acelerar(Aceleracao.NORMAL);
        car2.acelerar(Aceleracao.NORMAL);
        car2.frear();
        System.out.println(car2.getVelocidadeAtual());
    }
}
