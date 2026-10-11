package Questao04;

public class CartaoCredito extends Pagamento {

    @Override
    public double processar(double valor) {
        double taxa = valor * 0.05;
        return valor + taxa;
    }
}
