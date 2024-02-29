package org.example.factorymethod;

public class RedBeanFlavorFactory implements FishShapedBunFactory {
    @Override
    public FishShapedBun createFishShapeBun(String name, String flavor, int amount) {
        return new RedBeanFlavor(name, flavor, amount);
    }
}
