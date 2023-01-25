package Flowers;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;
    String flowerName;


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
    this.flowerColor = flowerColor;
    if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
        this.flowerColor = "белый";
    }
    this.country = country;
    if (country == null || country.isEmpty()) {
        this.country = "Россия";
    }
    this.cost = cost;
    if (cost <= 0.00) {
        this.cost = 1.00;
    }
    this.flowerName = flowerName;
    if (flowerName == null || flowerName.isEmpty()) {
        this.flowerName = "Информация не указана";
    }
    this.lifeSpan = lifeSpan;
    if (lifeSpan <= 0) {
        this.lifeSpan = 3;
    }
    }

    public void flower () {
        System.out.println("Название: " + flowerName + ". Цвет: " + flowerColor + ". Страна происхождения: " + country + ". Стоимость: " + cost + ". Срок стояния цветка: " + lifeSpan);
    }

}