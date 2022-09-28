package impressora;

import interfaces.IDocumento;

public class Pdf implements IDocumento {

    private Livro livro;

    public Pdf(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Pdf{" +
                "livro=" + livro +
                '}';
    }
}
