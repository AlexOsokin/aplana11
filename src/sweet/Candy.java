package sweet;

public class Candy extends Sweet{
    private String p;
    public Candy(double mas, double price, String p) {
        super(mas, price);
        name = "Конфета";
        this.p = p;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double getMas() {
        return mas;
    }
    @Override
    public void setMas(double mas) {
        this.mas = mas;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return getName() + ": " + getMas() + " грамм, " + getPrice() + " рублей. Вкус: " + p;
    }

}
