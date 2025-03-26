package task1;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Product doll = new Product("Кукла", 29.99);
        Product car = new Product("Машинка", 19.99);
        Product puzzle = new Product("Пазл", 9.99);

        store.addToy(doll.getName(), doll);
        store.addToy(car.getName(), car);
        store.addToy(puzzle.getName(), puzzle);

        store.printEntrySet();
        store.printKeySet();
        store.printValues();
    }
}
