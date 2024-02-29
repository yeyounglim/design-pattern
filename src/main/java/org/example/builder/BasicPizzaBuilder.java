package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class BasicPizzaBuilder implements PizzaBuilder{
    private String type;
    private String size;
    private String dough;
    private List<AddTopping> toppings;
    @Override
    public PizzaBuilder type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public PizzaBuilder base(String size, String dough) {
        this.size = size;
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(String vegetables, String meats) {
        if (this.toppings == null) {
            this.toppings = new ArrayList<>();
        }

        this.toppings.add(new AddTopping(vegetables, meats));
        return this;
    }

    @Override
    public Pizza getToppings() {
        return new Pizza(type, size, dough, toppings);
    }
}
