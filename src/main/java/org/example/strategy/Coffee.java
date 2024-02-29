package org.example.strategy;

public class Coffee {
    private String type;
    private String beans;
    private String hotIce;

    public Coffee() {
    }

    public Coffee(String type, String beans, String hotIce) {
        this.type = type;
        this.beans = beans;
        this.hotIce = hotIce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public String getHotIce() {
        return hotIce;
    }

    public void setHotIce(String hotIce) {
        this.hotIce = hotIce;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", beans='" + beans + '\'' +
                ", hotIce='" + hotIce + '\'' +
                '}';
    }
}
