package dio.com;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("..EXTRATO DE CONTA POUPANÇA..");
        super.gerarExtrato();
    }

}
