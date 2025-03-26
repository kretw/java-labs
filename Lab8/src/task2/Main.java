package task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "numbers.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int number = scanner.nextInt();
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int sum = 0;
            int count = 0;

            System.out.println("Числа из файла:");
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                System.out.println(number);
                sum += number;
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }
    }
}
