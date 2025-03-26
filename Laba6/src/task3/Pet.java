package task3;

public class Pet {
    private String name;
    private Integer age;

    public Pet(String name, Integer age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
