package transport;

public class CarMain {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая", "седан","у777уу777", 4,true,new Car.Key(true, false));
        System.out.println(lada);

        Car audi = new Car("Audi","A8 50 L TDI quattro",0,null,0,"Германия", "автомат", "внедорожник",null, 0,false, new Car.Key(false,true));
        System.out.println(audi);

        Car bmw = new Car("BMW","Z8",3,"черный",2021,"Германия", null, "пикап","в999вв999", 2, true, new Car.Key(true,true));
        bmw.car();

        Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южная Корея","механическая", "универсал","х123оо456", 3, false, new Car.Key(false,false));
        kia.car();

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея", "автомат", "купе","н159аа753", 4,false,null);
        hyundai.car();

        hyundai.changeTyres(4);
        System.out.println(hyundai);
    }
}
