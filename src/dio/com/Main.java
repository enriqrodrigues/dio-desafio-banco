package dio.com;

public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Zé");

        Conta corrente = new ContaCorrente(fulano);
        Conta poupanca = new ContaPoupanca(fulano);

        corrente.consultarSaldo();
        poupanca.consultarSaldo();

        corrente.depositar(100);
        corrente.consultarSaldo();
        poupanca.depositar(200);
        poupanca.consultarSaldo();
        poupanca.sacar(20);
        poupanca.consultarSaldo();

        poupanca.transferir(30, corrente);
        corrente.consultarSaldo();
        poupanca.consultarSaldo();

    }
}
