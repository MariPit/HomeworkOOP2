package Flowers;

public class FlowerMain {
    public static void main(String[] args) {

        Flower rose = new Flower("Роза", null, "Голландия", 35.59,0);
        Flower chrysanthemum = new Flower("Хризантема",null, null, 15.00,5);
        Flower pion = new Flower("Пион",null, "Англия", 69.90,1);
        Flower gypsophila = new Flower("Гипсофила",null, "Турция", 19.50,10);

        rose.flower ();
        chrysanthemum.flower();
        pion.flower();
        gypsophila.flower();
    }
}
