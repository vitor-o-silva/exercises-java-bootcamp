package InterfacesClientes;

public interface ICobradores extends ITransacao{
    void consultaSaldo();
    void saque(double valor);
}
