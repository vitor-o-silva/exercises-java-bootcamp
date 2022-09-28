package Clientes;

import InterfacesClientes.IExecutivos;

public class Executivos implements IExecutivos {
    @Override
    public void deposito(double valor) {
        System.out.println("Deposito de "+ valor);
    }

    @Override
    public void transferencia(double valor, String conta) {
        System.out.println("Voce transferiu "+valor+" para a conta" +conta);
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transacao OK");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao Negada");
    }
}
