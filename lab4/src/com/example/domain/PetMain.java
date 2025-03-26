package com.example.domain;
import com.example.domain.Cat;
import com.example.domain.Fish;

public class PetMain {
    public static void main(String[] args) {
        Animal a;
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        Pet p;
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        a = new Fish();
        a.eat();;
        a.walk();
    }
}
