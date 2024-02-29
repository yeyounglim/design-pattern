package org.example.builder;

import java.util.List;

public class Pizza {
    private String type;
    private String size;
    private String dough;
    private List<AddTopping> toppings;

    public Pizza(String type, String size, String dough, List<AddTopping> toppings) {
        this.type = type;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public List<AddTopping> getToppings() {
        return toppings;
    }

    public void setToppings(List<AddTopping> toppings) {
        this.toppings = toppings;
    }

    public void addToppings(String vegetables, String meats){
        this.toppings.add(new AddTopping(vegetables, meats));
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
