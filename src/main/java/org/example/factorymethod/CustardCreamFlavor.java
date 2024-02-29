package org.example.factorymethod;

public class CustardCreamFlavor extends FishShapedBun{
    public CustardCreamFlavor() {
        setName("기본슈크림");
        setAmount(20);
        setName("기본이름");
    }

    public CustardCreamFlavor(String name, String flavor, int amount) {
        setFlavor(flavor);
        setAmount(amount);
        setName(name);
    }
}
