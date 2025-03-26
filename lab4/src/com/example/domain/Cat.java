package com.example.domain;

public class Cat extends Animal implements Pet {
    public Cat() {
 public Cat() {
            // Конструктор по умолчанию
        }

    public Cat(String name) {
            this.name = name; // Конструктор с параметром
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void play() {
            System.out.println(name + " любит играть с веревочкой");
        }

        @Override
        public void eat() {
            System.out.println(name + " ест корм для кошек");
        }

        @Override
        public void walk() {
            System.out.println(name + " гуляет по комнате");
        }
}

