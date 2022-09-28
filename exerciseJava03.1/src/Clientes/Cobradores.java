package Clientes;

import InterfacesClientes.ICobradores;

public class Cobradores implements ICobradores {
    @Override
    public void consultaSaldo() {
        System.out.println("Voce tem X saldo");
    }

    @Override
    public void saque(double valor) {
        System.out.println("Saque de "+ valor);
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
