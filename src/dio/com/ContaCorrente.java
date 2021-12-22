package dio.com;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("..EXTRATO DE CONTA CORRENTE..");
        super.gerarExtrato();
    }

}
