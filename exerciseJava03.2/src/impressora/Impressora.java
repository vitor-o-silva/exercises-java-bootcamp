package impressora;

import interfaces.IDocumento;

public class Impressora {

    public void imprimir(IDocumento documento) {
        System.out.println("Imprimindo... :" + documento.toString());
    }
}
