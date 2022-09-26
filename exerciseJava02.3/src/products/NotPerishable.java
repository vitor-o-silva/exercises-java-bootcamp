package products;

public class NotPerishable extends Products{
    String type;
    public NotPerishable(String name,String type, double price) {
        super(name, price);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tipo:" + this.type;
    }

}
