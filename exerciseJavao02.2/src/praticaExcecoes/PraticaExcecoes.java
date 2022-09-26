package praticaExcecoes;

public class PraticaExcecoes {
    public static void calcRazao(int a, int b) {
            try {
                int total = b / a;
            } catch (ArithmeticException exception){
                throw new IllegalArgumentException("Não pode ser dividido por zero");
            } finally {
                System.out.println("Programa Finalizado");
            }
    }
}
