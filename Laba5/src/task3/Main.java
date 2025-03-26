package task3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Nolan", 2000.50),
                new Employee("Lucy Chen", 3000.75),
                new Employee("Tim Bradford", 4000.00),
                new Employee("Angela Lopez", 4000.85)
        };

        System.out.println("Отчёт на английском:");
        FullReport.generateReport(employees, new Locale("en","US"));

        System.out.println("\nОтчёт на русском:");
        FullReport.generateReport(employees, new Locale("ru", "BY"));
    }
}
