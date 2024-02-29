package org.example.strategy;

public class Order {
    private CoffeeStrategy strategy;

    public Order(CoffeeStrategy strategy){
        this.strategy = strategy;
    }

    public Coffee order(String type){
        switch (type){
            case "플랫화이트":
                this.strategy = new FlatWhite();
                break;
            case "콜드브루":
                this.strategy = new ColdBrew();
                break;
            case "아포가토":
                this.strategy = new Affogato();
                break;
        }
        String beans = this.strategy.selectBeans();
        String hotIce = this.strategy.selectHotIce();
        return new Coffee(type, beans, hotIce);
    }
}
