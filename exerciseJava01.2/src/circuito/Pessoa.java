package circuito;

public class Pessoa {
    protected String nome, sobrenome,celular, numeroEmergencia,grupoSanguineo;
    protected int rg,idade;

    public Pessoa(String nome, String sobrenome, String celular, String numeroEmergencia, String grupoSanguineo, int rg, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.rg = rg;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return  "RG:" + rg + '\'' +
                ", nome: " + nome + '\'' +
                ", sobrenome: " + sobrenome + '\'' +
                ", idade: " + idade +
                ", grupoSanguineo: " + grupoSanguineo + '\''+
                ", numeroCelular: " + celular + '\'' +
                ", numeroEmergencia: " + numeroEmergencia + '\'';

    }
}
