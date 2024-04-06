package org.example.z5;

// 5. Создайте класс Car с полями brand, model и year. Определите, какие определения методов и конструкторов нужно добавить к данному классу для его полной структурированности.
public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The car is starting...");
    }

    public void stop() {
        System.out.println("The car is stopping...");
    }
}
