package InterfacesClientes;

public interface IExecutivos extends ITransacao{
    void deposito(double valor);
    void transferencia(double valor, String conta);
}
