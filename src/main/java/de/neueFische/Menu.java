package de.neueFische;

import java.util.Objects;

public class Menu {

    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;
    private int id;



    public Menu(int id, String name, double price, String mainDish, String sideDish, String beverage){
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Double.compare(menu.price, price) == 0 && Objects.equals(name, menu.name) && Objects.equals(mainDish, menu.mainDish) && Objects.equals(sideDish, menu.sideDish) && Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, mainDish, sideDish, beverage);
    }
}
