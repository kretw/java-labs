package task3;

import java.util.HashMap;
import java.util.Map;

public class PetManager {

    private Map<String, Pet> pets = new HashMap<>();

    public void addPet(Pet pet) {
        pets.put(pet.getName(), pet);
    }

    public void printAllKeys() {
        System.out.println("Все ключи (имена животных) в map:");
        for (Pet value : pets.values()) {
            System.out.println(value);
        }
    }
}
