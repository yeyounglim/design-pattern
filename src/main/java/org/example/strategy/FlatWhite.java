package org.example.strategy;

public class FlatWhite implements CoffeeStrategy{
    @Override
    public String selectBeans() {
        return "에티오피아";
    }

    @Override
    public String selectHotIce() {
        return "hot";
    }
}
