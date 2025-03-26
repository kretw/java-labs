package task3;

class Dog extends Pet {
    public Dog(String name, Integer age) {
        super(name, age);
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
    }

    @Override
    public String toString() {
        return "Собака" + "имя='" + getName() + '\'' + ", Возраст=" + getAge();
    }
}
