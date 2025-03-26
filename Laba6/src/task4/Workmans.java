package task4;

public abstract class Workmans {
    public String name;

    public String getName() {
        return name;
    }

    public Workmans(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name);
    }

    public abstract double calc();
}


