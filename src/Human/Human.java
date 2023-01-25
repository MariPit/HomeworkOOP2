package Human;

import java.time.LocalDate;

public class Human {
    public String name;
    private String town;
    public int age;
    private int yearOfBirth;
    String job;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
    } else {
            this.yearOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
    }

        Human(String name, String town, int age, String job) {
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        this.job = job;
        if (job == null) {
            this.job = "Информация не указана";
        }
        this.town = town;
        if (town == null || town.isEmpty() || town.isBlank()) {
          this.town = "Информация не указана";
        }
        this.age = age;
        if (age < 0) {
            age = 0;
        }
        yearOfBirth = 2022 - age;
    }

    public void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я - " + job+ ". Будем знакомы!");
    }
}

