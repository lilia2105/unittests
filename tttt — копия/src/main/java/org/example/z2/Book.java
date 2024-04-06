package org.example.z2;

// 2. Создайте класс Book с полями title, author и year. Определите, какие методы и конструкторы должны быть включены в структуру данного класса.
public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
