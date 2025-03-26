package task1;

import java.io.*;

public class FileInfo {
    public static void main(String[] args) {
        String filePath = "info.txt";
        String content = "Имя: Забагонская Катя\nВозраст: 17 лет\nПрофессия: типо программист\nХобби: Чтение книг, конный спорт";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь к файлу: " + file.getAbsolutePath());
            System.out.println("Размер файла: " + file.length() + " байт");
            System.out.println("Последнее изменение: " + new java.util.Date(file.lastModified()));
        } else {
            System.out.println("Файл не найден.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nСодержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
