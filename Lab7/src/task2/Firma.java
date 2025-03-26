package task2;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String name;
    private List<Otdel> otdels;

    public Firma(String name) {
        this.name = name;
        this.otdels = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOtdel(Otdel otdel) {
        this.otdels.add(otdel);
    }

    public List<Otdel> getOtdels() {
        return otdels;
    }

    public void printOtdels() {
        System.out.println("Фирма: " + name);
        for (Otdel otdel : otdels) {
            System.out.println("Отдел: " + otdel.getName() + ", Количество сотрудников: " + otdel.getNumberOfEmployees());
        }
    }
}
