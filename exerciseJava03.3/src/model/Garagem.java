package model;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Garagem {
    private int id;
    private ArrayList<Veiculo> veiculos;

    public Garagem(int id) {
        this.id = id;
        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Veiculo> ordenaPreco(){
        return veiculos.stream()
                .sorted((a,b)-> (int) (a.getPreco() - b.getPreco()))
                .collect(Collectors.toList());
    }

    public List<Veiculo> ordenaMarca(){
        return veiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .collect(Collectors.toList());
    }

    public List<Veiculo> filtrarMenoresPrecos(){
        return veiculos.stream()
                .filter(veiculo -> veiculo.getPreco() < 1000)
                .collect(Collectors.toList());
    }

    public List<Veiculo> filtrarMaioresPrecos(){
        return veiculos.stream()
                .filter(veiculo -> veiculo.getPreco() >= 1000)
                .collect(Collectors.toList());
    }

    public String precoMedio(){
        double media = veiculos.stream()
                .mapToDouble(Veiculo::getPreco)
                .average()
                .getAsDouble();
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(media);
    }
}
