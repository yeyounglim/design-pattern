package org.example.factorymethod;

public class RedBeanFlavor extends FishShapedBun{
    public RedBeanFlavor() {
        setFlavor("기본팥");
        setAmount(3);
        setName("기본이름");
    }
    public RedBeanFlavor(String name, String flavor, int amount) {
        setFlavor(flavor);
        setAmount(amount);
        setName(name);
    }
}
