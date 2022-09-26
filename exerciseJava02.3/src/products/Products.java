package products;

public class Products {
    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calc(int amountProducts) {
        return amountProducts * this.price;
    }

    @Override
    public String toString() {
        return "Produto:" + "\n nome:'" + this.name + "\n Preço:" + this.price;
    }
}
