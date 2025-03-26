package task3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateReport(Employee[] employees, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("task3", locale);
        String fullNameHeader = bundle.getString("topic1");
        String salaryHeader = bundle.getString("topic2");
        System.out.printf("%-20s %20s%n", fullNameHeader, salaryHeader);
        System.out.println("--------------------------------------------");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for (Employee emp : employees) {
            double salaryInCurrency = emp.salary;
            if (locale.getLanguage().equals("ru")) {
                salaryInCurrency = emp.salary * 3.24;
            }

            // Вывод информации о сотрудниках
            System.out.printf("%-20s %20s%n", emp.fullname, currencyFormatter.format(salaryInCurrency));
        }
    }
}
