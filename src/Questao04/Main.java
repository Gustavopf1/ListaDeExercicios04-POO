package Questao04;

public class Main {
    public static void main(String[] args){
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        double valor = 100;

        System.out.println("Usando Cartao de credito: " + p1.processar(valor));
        System.out.println("Usando boleto: " + p2.processar(valor));
        System.out.println("Usando Pix: "+ p3.processar(valor));
    }
}
