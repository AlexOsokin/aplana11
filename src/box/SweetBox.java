package box;

import sweet.Sweet;

import java.util.Arrays;

public class SweetBox implements Box{
    private Sweet[] sweets = new Sweet[0];
    @Override
    public void setSweet(Sweet sweet) {
     sweets = Arrays.copyOf(sweets, sweets.length + 1);
     sweets[sweets.length-1] =  sweet;
    }

    @Override
    public void deleteSweet(int i) {
        if (i < 0 || i >= sweets.length){
            System.out.println("Такого нет!");
            return;
        }
        Sweet[] sw = new Sweet[sweets.length - 1];
        int k = 0;
        for (int j = 0; j < sweets.length; j++){
            if(j == i){
                if(j == sweets.length - 1){
                    break;
                }
                j++;
            }
            sw[k] = sweets[j];
            k++;
        }
        sweets = Arrays.copyOf(sw, sweets.length - 1);

    }

    @Override
    public void deleteLastSweet() {
        deleteSweet(sweets.length - 1);
    }

    @Override
    public double getBoxMass() {
        double m = 0;
        if(sweets.length > 0) {
            for (int i = 0; i < sweets.length; i++) {
                m = m + sweets[i].getMas();
            }
            System.out.print("Масса коробки - ");
            System.out.printf("%.2f", m);
            System.out.println(" грамм");
        }
        else {
            System.out.println("Коробка пуста");
        }
        return m;
    }

    @Override
    public double getBoxPrice() {
        double p = 0;
        if(sweets.length > 0) {
            for (int i = 0; i < sweets.length; i++) {
                p = p + sweets[i].getPrice();
            }
            System.out.print("Цена коробки - ");
            System.out.printf("%.2f", p);


        }
        else {
            System.out.println("Коробка пуста");
        }
        return p;
    }

    @Override
    public void getBoxTable() {
        if(sweets.length > 0) {
            for (int i = 0; i < sweets.length; i++) {
                System.out.println(i + " " + sweets[i].toString());
            }
        }
        else{
            System.out.println("Коробка пуста");
        }

    }

    @Override
    public void getBoxMassSort(double m) {
        if(sweets.length > 0 && m > 0) {
            double countMin = 0;
            double mass = getBoxMass();
            while (true) {
                //countMin = countMin + minMass();
                if (mass - countMin <= m){
                    return;
                }
                countMin = countMin + minMass();
            }
        }
        else {
            System.out.println("Ошибка!");
        }
    }

    @Override
    public void getBoxPriceSort(double p) {
        if(sweets.length > 0 && p > 0) {
            double countMin = 0;
            double price = getBoxPrice();
            while (true) {
                //countMin = countMin + minMass();
                if (price - countMin <= p){
                    return;
                }
                countMin = countMin + minPrice();
            }
        }
        else {
            System.out.println("Ошибка!");
        }
    }

    double minMass(){
        double min = sweets[0].getMas();
        int sw = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (min > sweets[i].getMas()) {
                min = sweets[i].getMas();
                sw = i;
            }
        }
        deleteSweet(sw);
        return min;
    }
    double minPrice(){
        double min = sweets[0].getPrice();
        int sw = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (min > sweets[i].getPrice()) {
                min = sweets[i].getPrice();
                sw = i;
            }
        }
        deleteSweet(sw);
        return min;
    }

}
