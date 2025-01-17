public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 15.00;
        double ValorSolicitado = 17.00;

        if (ValorSolicitado < saldo){
            saldo = saldo - ValorSolicitado;
            System.out.println("Saldo restante: " + saldo);
        } else
            System.out.println("Saldo insuficiente");
    }
}