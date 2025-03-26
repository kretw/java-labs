package task3;

public class Main {
    public static void main(String[] args) {
        PetManager manager = new PetManager();

        try {
            Pet cat = new Cat("Даша", 4);
            manager.addPet(cat);
            Pet dog = new Dog("Бони", 5);
            manager.addPet(dog);
            Pet parrot = new Parrot("",4);
            manager.addPet(parrot);
            manager.printAllKeys();
        }
            catch (IllegalArgumentException e) {
                System.err.println("Ошибка создания животного: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка вывода ключа: " + e.getMessage());
        }
    }
}
