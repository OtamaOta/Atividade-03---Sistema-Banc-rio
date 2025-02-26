public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_RETIRADA = 0.05;
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * TAXA_RETIRADA;
        if (saldo >= SALDO_MINIMO && valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou abaixo do mínimo exigido para saque.");
        }
    }
}