package task1;

import java.util.HashMap;
import java.util.Map;

public class ToyStore {

    private Map<String, Product> toys = new HashMap<>();

    public void addToy(String name, Product toy) {
        toys.put(name, toy);
    }

    public void printEntrySet() {
        System.out.println("Набор записей:");
        for (Map.Entry<String, Product> entry : toys.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printKeySet() {
        System.out.println("Набор ключей:");
        for (String key : toys.keySet()) {
            System.out.println(key);
        }
    }

    public void printValues() {
        System.out.println("Значения:");
        for (Product value : toys.values()) {
            System.out.println(value);
        }
    }

}

