package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Workmans> workers = new ArrayList<>();
        workers.add(new Fix(5897.0, "Дима"));
        workers.add(new Hourly(40.0, "Арсен"));
        workers.add(new Fix(5436.0, "Боря"));
        workers.add(new Hourly(35.0, "Евлампий"));
        workers.add(new Fix(6547.0, "Иннокеша"));
        workers.add(new Hourly(35.0, "Любочка"));

        workers.sort(new Comparator<Workmans>() {
            @Override
            public int compare(Workmans w1, Workmans w2) {
                int salaryComparison = Double.compare(w2.calc(), w1.calc());
                if (salaryComparison != 0) {
                    return salaryComparison;
                } else {
                    return w2.getName().compareTo(w1.getName());
                }
            }
        });

        System.out.println("Список сотрудников:");
        for (Workmans worker : workers) {
            System.out.println("Имя: " + worker.getName() + ", Среднемесячная зарплата: " + worker.calc());
        }

        System.out.println("\nПервые 5 имен работников:");
        for (int i = 0; i < Math.min(5, workers.size()); i++) {
            System.out.println(workers.get(i).getName());
        }

        System.out.println("\nПоследние 3 идентификатора работников:");
        for (int i = Math.max(0, workers.size() - 3); i < workers.size(); i++) {
            System.out.println(workers.get(i).getName());
        }
    }
}
