package circuito;

public class Inscricao {
    private Pessoa pessoa;
    private double valor;
    private String tipo;

    public Inscricao(Pessoa pessoa, String tipo) {
        this.pessoa = pessoa;
        this.tipo = tipo;
        this.setValor(calcValor());
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcValor(){
        boolean idade = this.pessoa.idade < 18;
        if (this.tipo == "pequeno"){
            return idade ? 1300 : 1500;
        } else if (this.tipo == "medio") {
            return idade ? 2000 : 2300;
        } else if (this.tipo == "avancado" && !idade) {
            return 2800;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "\nInscricao:{ " +
                "Pessoa: { " + pessoa + " }"+
                ",categoria:" + tipo +
                ",valorInscricao:" + valor +
                '}';
    }
}
