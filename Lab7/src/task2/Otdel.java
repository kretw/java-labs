package task2;

import java.util.ArrayList;
import java.util.List;

public class Otdel {
    private String name;
    private int numberOfEmployees;
    private List<Sotrudnik> sotrudniki;

    public Otdel(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.sotrudniki = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void addSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudniki.add(sotrudnik);
    }

    public List<Sotrudnik> getSotrudniki() {
        return sotrudniki;
    }
}
