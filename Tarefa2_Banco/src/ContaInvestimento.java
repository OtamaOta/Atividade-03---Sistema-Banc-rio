public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}