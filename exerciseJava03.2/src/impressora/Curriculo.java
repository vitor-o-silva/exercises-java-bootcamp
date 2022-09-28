package impressora;

import interfaces.IDocumento;

public class Curriculo implements IDocumento {

    private Pessoa pessoa;

    public Curriculo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    @Override
    public String toString() {
        return "Curriculo: "+this.pessoa;
    }
}
