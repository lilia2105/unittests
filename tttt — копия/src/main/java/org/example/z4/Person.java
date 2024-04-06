package org.example.z4;

// 4. Разработайте класс Person с полями firstName, lastName и age. Определите, какие методы и конструкторы должны быть включены в структуру данного класса.
public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
