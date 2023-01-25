package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String carBody;
    private String regNamber;
    private final int capacity;
    private boolean summerTires;
    private Key key;

    public static class Key{
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun? "удаленный запуск двигателя":"без удаленного запуска двигателя") +
                    ", " + (withoutAccess? "бесключевой доступ":"бесключевой доступ отсутствует");
        }
    }

    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry, String transmission,
               String carBody, String regNamber, int capacity, boolean summerTires, Key key) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "нет информации";
        }
        this.brand = brand;

        if (model == null || model.isBlank() || model.isEmpty()) {
            model = "нет информации";
        }
        this.model = model;

        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "Россия";
        }
        this.productionCountry = productionCountry;

        if (carBody == null || carBody.isBlank() || carBody.isEmpty()) {
            carBody = "хетчбэк";
        }
        this.carBody = carBody;

        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTires = summerTires;
        setEngineVolume(engineVolume);
        setColor(color);
        setRegNamber(regNamber);
        setTransmission(transmission);
        setKey(key);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "механическая";
        }
    }

    public String getCarBody() {
        return carBody;
    }

    public String getRegNamber() {
        return regNamber;
    }

    public void setRegNamber(String regNamber) {
        if (regNamber == null || regNamber.isEmpty() || regNamber.isBlank()) {
            regNamber = "x000xx000";
        }
        this.regNamber = regNamber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false,false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTires = false;
        }
        if (month >= 4 && month <= 10) {
            summerTires = true;
        }
    }

    public void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки - "
                + productionCountry + ", цвет - " + color + ", объем двигателя - " + engineVolume
                + ", коробка передач - " + transmission + ", тип кузова - " + carBody + ", регистрационный номер - "
                + regNamber + ", количество мест - " + capacity + ", резина - " + (summerTires ? "летняя" : "зимняя") + ", " + key);
    }

    @Override
    public String toString() {
        return "Марка - " + brand + ", модель - " + model + ", " + productionYear + " год выпуска, страна сборки - "
                + productionCountry + ", цвет - " + color + ", объем двигателя - " + engineVolume
                + ", коробка передач - " + transmission + ", тип кузова - " + carBody + ", регистрационный номер - "
                + regNamber + ", количество мест - " + capacity + ", резина - " + (summerTires ? "летняя" : "зимняя") + ", " + key;
    }
}
