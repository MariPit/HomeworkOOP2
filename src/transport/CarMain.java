package transport;

public class CarMain {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        System.out.println("марка - " + lada.brand + ", модель - " + lada.model
                + ", объем двигателя в литрах - " + lada.engineVolume + ", цвет кузова - " + lada.color
                + ", год производства - " + lada.productionYear + ", страна сборки - " + lada.productionCountry);

        Car audi = new Car("Audi","A8 50 L TDI quattro",0,null,0,"Германия");
        System.out.println("марка - " + audi.brand + ", модель - " + audi.model
                + ", объем двигателя в литрах - " + audi.engineVolume + ", цвет кузова - " + audi.color
                + ", год производства - " + audi.productionYear + ", страна сборки - " + audi.productionCountry);

        Car bmw = new Car("BMW","Z8",3,"черный",2021,"Германия");
        System.out.println("марка - " + bmw.brand + ", модель - " + bmw.model
                + ", объем двигателя в литрах - " + bmw.engineVolume + ", цвет кузова - " + bmw.color
                + ", год производства - " + bmw.productionYear + ", страна сборки - " + bmw.productionCountry);

        Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южная Корея");
        System.out.println("марка - " + kia.brand + ", модель - " + kia.model
                + ", объем двигателя в литрах - " + kia.engineVolume + ", цвет кузова - " + kia.color
                + ", год производства - " + kia.productionYear + ", страна сборки - " + kia.productionCountry);

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        hyundai.car();
    }
}
