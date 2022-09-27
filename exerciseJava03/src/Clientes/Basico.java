package Clientes;

import InterfacesClientes.IBasico;

public class Basico implements IBasico {
    @Override
    public void consultaSaldo() {
        System.out.println("Seu saldo é X");
    }

    @Override
    public void pgServicos() {

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
