package Questao04;

public class Boleto extends Pagamento {

    @Override
    public double processar(double valor) {
        double desconto = valor * 0.03;
        return valor - desconto;
    }
}
