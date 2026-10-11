package Questao04;

public class Pix extends Pagamento {

    @Override
    public double processar(double valor) {
        double desconto = valor * 0.05;
        return valor - desconto;
    }
}
