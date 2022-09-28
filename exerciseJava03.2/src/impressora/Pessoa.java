package impressora;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    private String telefone;
    private ArrayList<String> listaHabilidades = new ArrayList<>();

    private String habilidades;

    public Pessoa(String nome, int idade, String email, String telefone, String habilidades) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.habilidades = habilidades;
        setListaHabilidades();
    }

    public void setListaHabilidades() {
        String[] arrayHabilidades = this.habilidades.split(",");
        for (String i: arrayHabilidades) {
            this.listaHabilidades.add(i);
        }
    }

    @Override
    public String toString() {
        return "Pessoa: {" +
                "Nome: " + this.nome +
                ",idade: "+ this.idade +
                ",email: "+ this.email +
                ",Habilidades: {"+this.listaHabilidades+
                "}}";
    }
}
