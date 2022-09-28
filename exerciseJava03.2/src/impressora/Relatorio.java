package impressora;

import interfaces.IDocumento;

public class Relatorio implements IDocumento {
    private int paginas;
    private String autor;
    private int qtdCaractere;

    public Relatorio(int paginas, String autor, int qtdCaractere) {
        this.paginas = paginas;
        this.autor = autor;
        this.qtdCaractere = qtdCaractere;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", qtdCaractere=" + qtdCaractere +
                '}';
    }
}
