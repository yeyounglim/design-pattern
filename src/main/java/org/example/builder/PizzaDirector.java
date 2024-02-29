package org.example.builder;

public class PizzaDirector {
    private BasicPizzaBuilder basicPizzaBuilder;

    public PizzaDirector(BasicPizzaBuilder basicPizzaBuilder) {
        this.basicPizzaBuilder = basicPizzaBuilder;
    }

    public Pizza pepperoni() {
        return basicPizzaBuilder.type("페퍼로니 피자")
                .base("라지","얇은도우")
                .addToppings("양파","페퍼로니")
                .getToppings();
    }

    public Pizza halfPizza() {
        return basicPizzaBuilder.type("하프 앤 하프 피자")
                .base("라지","두꺼운도우")
                .addToppings("고구마","새우")
                .addToppings("파인애플","베이컨")
                .getToppings();
    }
}
