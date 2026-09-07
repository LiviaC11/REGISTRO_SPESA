package org.example;

public class Product {
    private String name;
    private String brand;
    private Double weight;
    private Double priceKg;

    public Product(String name, String brand, Double weight, Double priceKg) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.priceKg = priceKg;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Double getPriceKg() {
        return this.priceKg;
    }

    public Double currentPrice() {
        return this.getWeight() * this.getPriceKg();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", brand=" + brand + ", weight=" + weight + ", priceKg=" + priceKg + "]\n";
    }

}
