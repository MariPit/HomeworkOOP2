package Human;

public class HumanMain {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", "Минск", 35,"бренд-менеджер");
        Human anna = new Human("Аня", "Москва", -29, "методист образовательных программ");
        Human kate = new Human(null, "Калининград",28,"продакт-менеджер");
        Human artem = new Human("Артем","Москва",27,"директор по развитию бизнеса");
        Human vova = new Human("Владимир", "Казань", 21, "безработный");

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown()
                + ". Я родился в " + maxim.getYearOfBirth() + " году. Я работаю на должности " + maxim.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.getTown()
                + ". Я родился в " + anna.getYearOfBirth() + " году. Я работаю на должности " + anna.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + kate.name + ". Я из города " + kate.getTown()
                + ". Я родился в " + kate.getYearOfBirth() + " году. Я работаю на должности " + kate.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown()
                + ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.job
                + ". Будем знакомы!");
        vova.human();
        System.out.println();

        maxim.human();
        anna.human();
        kate.human();
        artem.human();

    }
}
