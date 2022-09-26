package products;

public class Perishable extends Products{
    private int daysToWin;

    public Perishable(String name, double price,int daysToWin) {
        super(name, price);
        this.setDaysToWin(daysToWin);
    }

    public int getDaysToWin() {
        return daysToWin;
    }

    public void setDaysToWin(int daysToWin) {
        this.daysToWin = daysToWin;
    }

    @Override
    public double calc(int amountProducts) {
        double total = amountProducts * this.price;
        switch (this.daysToWin) {
            case 1:
                total = total / 4;
            break;
            case 2:
                total = total / 3;
                break;
            case 3:
                total = total / 2;
                break;
            default:
                return total;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Validade:" + this.daysToWin;
    }
}
