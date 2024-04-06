package org.example.z3;

// 3. Имеется класс Circle с полями radius и color. Напишите программу, которая определит структуру данного класса и включит метод для вычисления площади окружности.
public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
