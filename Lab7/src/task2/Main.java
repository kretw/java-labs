package task2;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("Abricos");

        Otdel itOtdel = new Otdel("IT Отдел", 5);
        Otdel hrOtdel = new Otdel("HR Отдел", 3);

        try {
            Sotrudnik sotrudnik1 = new ShtatnySotrudnik("Иванов Иван Иванович", "Менеджер", 50000, 5000);
            itOtdel.addSotrudnik(sotrudnik1);
            System.out.println("Зарплата штатного сотрудника: " + sotrudnik1.calculateSalary());
            Sotrudnik sotrudnik2 = new SotrudnikPoKontraktu("Петров Петр Петрович", "Разработчик", 60000);
            hrOtdel.addSotrudnik(sotrudnik2);

            System.out.println("Зарплата сотрудника по контракту: " + sotrudnik2.calculateSalary());
            Sotrudnik sotrudnik3 = new ShtatnySotrudnik("Сидоров Сидор Сидорович", "Аналитик", 40000, -3000);
            itOtdel.addSotrudnik(sotrudnik3);
            System.out.println("Зарплата штатного сотрудника с отрицательной премией: " + sotrudnik3.calculateSalary());
            Sotrudnik sotrudnik4 = new ShtatnySotrudnik("Алексеев Алексей Алексеевич", "Менеджер", -50000, 5000);
            itOtdel.addSotrudnik(sotrudnik4);

            System.out.println("Зарплата штатного сотрудника с отрицательным окладом: " + sotrudnik4.calculateSalary());
        } catch (OkladException e) {
            System.err.println("Невозможно создать сотрудника – указан отрицательный оклад: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ошибка при создании штатного сотрудника с отрицательным окладом: " + e.getMessage());
        }
    }
}
