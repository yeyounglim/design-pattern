package org.example.builder;

public interface PizzaBuilder {
    PizzaBuilder type(String type);
    PizzaBuilder base(String size, String dough);
    PizzaBuilder addToppings(String vegetables, String meats);
    Pizza getToppings();
}
