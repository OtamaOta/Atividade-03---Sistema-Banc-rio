public class ContaSalario extends ContaCorrente {
    private int saquesGratuitos;
    private static final double TAXA_SAQUE = 5.0;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitos = 1;
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratuitos > 0) {
            super.sacar(valor);
            saquesGratuitos--;
        } else {
            double valorComTaxa = valor + TAXA_SAQUE;
            if (valorComTaxa <= saldo + limiteChequeEspecial) {
                saldo -= valorComTaxa;
                System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + TAXA_SAQUE + ". Novo saldo: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }
}