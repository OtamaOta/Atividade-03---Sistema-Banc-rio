public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", "João", 1000, 500);
        cc.depositar(200);
        cc.sacar(1500);
        cc.exibirInformacoes();

        ContaPoupanca cp = new ContaPoupanca("67890", "Maria", 3000);
        cp.sacar(4000);
        cp.exibirInformacoes();

        ContaInvestimento ci = new ContaInvestimento("54321", "Carlos", 5000);
        ci.sacar(1000);
        ci.exibirInformacoes();

        ContaSalario cs = new ContaSalario("98765", "Ana", 2000, 300);
        cs.sacar(500);
        cs.sacar(500);
        cs.exibirInformacoes();

        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("11223", "Pedro", 15000);
        ciar.sacar(5000);
        ciar.exibirInformacoes();
    }
}