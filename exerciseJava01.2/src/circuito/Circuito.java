package circuito;

import java.util.ArrayList;

public  class Circuito {
    private String tipo;
    private ArrayList<Inscricao> inscricoes;

    public String getTipo() {
        return tipo;
    }

    public Circuito(String tipo) {
        this.tipo = tipo;
        this.inscricoes = new ArrayList<>();
    }

    public void addInscricao(Inscricao inscricao){
        if(this.tipo == "avancado" && inscricao.getPessoa().idade < 18){
            System.out.println(inscricao.getPessoa().nome + " com inscricao negada devido menor idade");
            return;
        }
        if (!inscricoes.contains(inscricao)) this.inscricoes.add(inscricao);
    }
    @Override
    public String toString() {
        return "inscricoes:" + this.inscricoes;
    }
}
