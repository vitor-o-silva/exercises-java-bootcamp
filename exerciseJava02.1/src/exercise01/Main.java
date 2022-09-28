package exercise01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("joao","1",28,130,1.90);
        Pessoa pessoa3 = new Pessoa("maria","2",17);
        System.out.println(pessoa2.calcImc());
        System.out.println(pessoa2.isLegalAge());
        System.out.println(pessoa1.toString());
        System.out.println(pessoa3.isLegalAge());
    }
}
