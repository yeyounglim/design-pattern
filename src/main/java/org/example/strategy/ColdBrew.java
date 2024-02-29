package org.example.strategy;

public class ColdBrew implements CoffeeStrategy{
    @Override
    public String selectBeans() {
        return "브라질";
    }

    @Override
    public String selectHotIce() {
        return "ice";
    }
}
