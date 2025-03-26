package task5;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String filePath = "f1.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100) - 50;
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int positiveCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    positiveCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }

        System.out.println("Количество положительных значений: " + positiveCount);
    }
}

