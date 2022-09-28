package impressora;

public class Livro {
    private int paginas;
    private String nome;
    private String titulo;
    private String genero;

    public Livro(int paginas, String nome, String titulo, String genero) {
        this.paginas = paginas;
        this.nome = nome;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "paginas=" + paginas +
                ", nome='" + nome + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
