package com.example.domain;

public abstract class Animal {
    protected String name; // Защищённое поле для имени

    public abstract void eat(); // Абстрактный метод для еды
    public abstract void walk(); // Абстрактный метод для прогулки
}