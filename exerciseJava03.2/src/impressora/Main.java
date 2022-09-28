package impressora;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("joao",28,"joao@email.com","(31)-99999-89899","java,mongo,mysql");
        Curriculo curriculo = new Curriculo(pessoa);

        Livro livro = new Livro(600,"J. R. R. Tolkien","O Senhor dos Aneis","fantasia");
        Pdf pdf = new Pdf(livro);

        Relatorio relatorio = new Relatorio(10,"Maria",300);

        Impressora impressora = new Impressora();

        System.out.println("___________Curriculo____________");
        impressora.imprimir(curriculo);

        System.out.println("___________PDF____________");
        impressora.imprimir(pdf);

        System.out.println("___________Relatorio____________");
        impressora.imprimir(relatorio);
    }
}
