package transport;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry){
        this.brand = brand;
        if (brand==null){
            this.brand = "default";
        }
        this.model = model;
        if (model==null){
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear == 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry==null){
            this.productionCountry = "default";
        }

    }

    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки - "
                + productionCountry +", цвет - " + color + ", объем двигателя - " + engineVolume);
    }
}
