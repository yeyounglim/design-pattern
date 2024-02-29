package org.example.builder;

public class AddTopping {
    private String vegetables;
    private String meats;

    public AddTopping(String vegetables, String meats) {
        this.vegetables = vegetables;
        this.meats = meats;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    @Override
    public String toString() {
        return "AddTopping{" +
                "vegetables='" + vegetables + '\'' +
                ", meats='" + meats + '\'' +
                '}';
    }
}
