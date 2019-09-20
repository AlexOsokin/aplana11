package sweet;

abstract public class Sweet {
    double mas;
    double price;
    String name;
    Sweet(double mas, double price){
        this.mas = mas;
        this.price = price;
    }
    public abstract double getPrice();
    public abstract void setPrice(double price);
    public abstract double getMas();
    public abstract void setMas(double mas);
    public abstract String getName();
    public abstract String toString();
}