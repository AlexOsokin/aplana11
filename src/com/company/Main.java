package com.company;

import box.SweetBox;
import sweet.Cake;
import sweet.Candy;
import sweet.Jellybean;

public class Main {

    public static void main(String[] args) {
        Cake c = new Cake(1.1,1.1, "Со сливочным кремом");
        Candy ca = new Candy(1.5,1.5, "Малиновая");
        Candy ca1 = new Candy(1.2,2.4, "Клубничная");
        Candy ca2 = new Candy(1.12,1.4, "Шоколадная");
        Candy ca3 = new Candy(1.14,2.5, "Ягодная");
        Jellybean jb = new Jellybean(0.1,1.0, "Красная");
        SweetBox sb = new SweetBox();
        sb.setSweet(c);
        sb.setSweet(ca);
        sb.setSweet(ca1);
        sb.setSweet(ca2);
        sb.setSweet(ca3);
        sb.setSweet(jb);
        sb.getBoxTable();
        System.out.println("Удаление");
        sb.deleteSweet(2);
        sb.getBoxTable();
        System.out.println("Удаление последнего");
        sb.deleteLastSweet();
        sb.getBoxTable();
        sb.getBoxMass();
        sb.getBoxPrice();
        System.out.println("Умная оптимизация по значению массы");
        sb.getBoxMassSort(4);
        sb.getBoxTable();
        System.out.println("Умная оптимизация по значению цены");
        sb.getBoxPriceSort(4);
        sb.getBoxTable();
        sb.getBoxMass();
        sb.getBoxPrice();
    }
}
