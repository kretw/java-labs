package task4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "temperatures.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            System.out.println("Введите 15 вещественных значений температуры:");
            for (int i = 0; i < 5; i++) {
                double temperature = scanner.nextDouble();
                writer.write(temperature + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            double sum = 0;
            int count = 0;

            System.out.println("Значения температуры из файла:");
            while ((line = reader.readLine()) != null) {
                double temperature = Double.parseDouble(line);
                System.out.println(temperature);
                sum += temperature;
                count++;
            }

            double averageTemperature = sum / count;
            System.out.println("Средняя температура: " + averageTemperature);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }
    }
}

