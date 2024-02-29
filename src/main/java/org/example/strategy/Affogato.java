package org.example.strategy;

public class Affogato implements CoffeeStrategy{
    @Override
    public String selectBeans() {
        return "케냐";
    }

    @Override
    public String selectHotIce() {
        return "ice";
    }
}
