package box;

import sweet.Sweet;

public interface Box {
    public void setSweet(Sweet sweet);
    public void deleteSweet(int i);
    public void deleteLastSweet();
    public double getBoxMass();
    public double getBoxPrice();
    public void getBoxTable();
    public void getBoxMassSort(double m);
    public void getBoxPriceSort(double m);
}