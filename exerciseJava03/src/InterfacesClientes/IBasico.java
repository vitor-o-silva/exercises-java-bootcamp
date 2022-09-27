package InterfacesClientes;

public interface IBasico extends ITransacao {
    void consultaSaldo();
    void pgServicos();
    void saque(double valor);
}
