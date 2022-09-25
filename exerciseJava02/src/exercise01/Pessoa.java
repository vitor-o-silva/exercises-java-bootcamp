package exercise01;

public class Pessoa {
    private String nome,id;
    private int idade;
    private double peso,altura;

    public Pessoa(String nome, String id, int idade) {
        this.setNome(nome);
        this.setId(id);
        this.setIdade(idade);
    }

    public Pessoa(String nome, String id, int idade, double peso, double altura) {
        this.setNome(nome);
        this.setId(id);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcImc() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso Saudável";
        }else {
            return "Sobrepeso";
        }
    }
    public boolean isLegalAge () {
        return this.idade > 18;
    }

    @Override
    public String toString() {
        return "\n Nome: " + this.nome  +"\n idade: " + this.idade +
                "\n Peso: " + this.peso + "\n Altura: " + this.altura +
                "\n id: " + this.id;
    }
}
