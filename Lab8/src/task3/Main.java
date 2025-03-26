package task3;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileF))) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int number = random.nextInt(100);
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл f: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(fileF));
             BufferedWriter writerG = new BufferedWriter(new FileWriter(fileG));
             BufferedWriter writerH = new BufferedWriter(new FileWriter(fileH))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    writerG.write(number + "\n");
                } else {
                    writerH.write(number + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файлов: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }


        System.out.println("Содержимое файла g (четные числа):");
        printFileContent(fileG);

        System.out.println("Содержимое файла h (нечетные числа):");
        printFileContent(fileH);
    }


    public static void printFileContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла " + filePath + ": " + e.getMessage());
        }
    }
}

