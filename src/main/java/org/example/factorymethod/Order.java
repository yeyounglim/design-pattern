package org.example.factorymethod;

public class Order {
    public void orders(FishShapedBunFactory fishFactory, String name, String flavor, int amount){
        System.out.println(fishFactory.orderBun(name, flavor, amount));
    }
}
