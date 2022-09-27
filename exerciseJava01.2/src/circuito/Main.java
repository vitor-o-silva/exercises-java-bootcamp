package circuito;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("antonio","Silva","(31)911111111","(31)9876543216","AB",11111111,19);
        Pessoa pessoa2 = new Pessoa("Maria","Souza","(31)922222222","(31)9876543216","A",22222222,17);
        Pessoa pessoa3 = new Pessoa("Jose","Oliveira","(31)933333333","(31)9876543216","B",33333333,20);
        Pessoa pessoa4 = new Pessoa("Joao","Santos","(31)944444444","(31)9876543216","O",44444444,22);
        Pessoa pessoa5 = new Pessoa("Madalena","Saraiva","(31)955555555","(31)9876543216","A",55555555,25);
        Pessoa pessoa6 = new Pessoa("Vitoria","Winchester","(31)966666666","(31)9876543216","B",66666666,29);
        Pessoa pessoa7 = new Pessoa("Bruno","Scofield","(31)977777777","(31)9876543216","AB",77777777,38);
        Pessoa pessoa8 = new Pessoa("AmANDA","Luana","(31)988888888","(31)9876543216","A",88888888,16);

        System.out.println("________________________Circuito Pequeno__________________________");

        Circuito circuitoPequeno = new Circuito("pequeno");

        Inscricao inscricao = new Inscricao(pessoa1,circuitoPequeno.getTipo());
        Inscricao inscricao2 = new Inscricao(pessoa2,circuitoPequeno.getTipo());

        circuitoPequeno.addInscricao(inscricao);
        circuitoPequeno.addInscricao(inscricao2);
        circuitoPequeno.addInscricao(inscricao2);

        System.out.println(circuitoPequeno.toString());


        System.out.println("________________________Circuito Medio__________________________");

        Circuito circuitoMedio = new Circuito("medio");

        Inscricao inscricao3 = new Inscricao(pessoa3,circuitoMedio.getTipo());
        Inscricao inscricao4 = new Inscricao(pessoa4,circuitoMedio.getTipo());


        circuitoMedio.addInscricao(inscricao3);
        circuitoMedio.addInscricao(inscricao4);
        circuitoMedio.addInscricao(inscricao3);

        System.out.println(circuitoMedio.toString());

        System.out.println("________________________Circuito Avancado__________________________");

        Circuito circuitoAvancado = new Circuito("avancado");

        Inscricao inscricao5 = new Inscricao(pessoa5,circuitoAvancado.getTipo());
        Inscricao inscricao6 = new Inscricao(pessoa6,circuitoAvancado.getTipo());
        Inscricao inscricao7 = new Inscricao(pessoa7,circuitoAvancado.getTipo());
        Inscricao inscricao8 = new Inscricao(pessoa8,circuitoAvancado.getTipo());


        circuitoAvancado.addInscricao(inscricao5);
        circuitoAvancado.addInscricao(inscricao6);
        circuitoAvancado.addInscricao(inscricao7);
        circuitoAvancado.addInscricao(inscricao8);

        System.out.println(circuitoAvancado.toString());
    }
}
