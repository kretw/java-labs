import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания(1-5): ");
        int n = scanner.nextInt();
        switch(n){
            case 1:{
                double x = 4 / 2 + Math.pow(3,2);
                System.out.println("Значение x = " + x);
            break;}
            case 2:{
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();

                int[] array = new int[size];

                System.out.println("Введите " + size + " целых чисел:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }

                System.out.print("Введите цифру для поиска (0-9): ");
                int digitToFind = scanner.nextInt();

                if (digitToFind < 0 || digitToFind > 9) {
                    System.out.println("Ошибка: Введите цифру в диапазоне от 0 до 9.");
                    return;
                }

                int count = 0;
                for (int num : array) {
                    if (num == digitToFind) {
                        count++;
                    }
                }

                System.out.println("Цифра " + digitToFind + " встречается в массиве " + count + " раз.");

                break;
            }
            case 3: {
                System.out.print("Введите размер матрицы (n x n): ");
                n = scanner.nextInt();

                int[][] matrix = new int[n][n];

                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("Элемент[%d][%d]: ", i, j);
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                int maxElement = Integer.MIN_VALUE;
                int minElement = Integer.MAX_VALUE;
                int maxSumIndex = -1, maxRow = -1, maxCol = -1;
                int minSumIndex = Integer.MAX_VALUE, minRow = -1, minCol = -1;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int currentElement = matrix[i][j];
                        int sumIndices = i + j;

                        if (currentElement > maxElement ||
                                (currentElement == maxElement && sumIndices > maxSumIndex)) {
                            maxElement = currentElement;
                            maxSumIndex = sumIndices;
                            maxRow = i;
                            maxCol = j;
                        }

                        if (currentElement < minElement ||
                                (currentElement == minElement && sumIndices < minSumIndex)) {
                            minElement = currentElement;
                            minSumIndex = sumIndices;
                            minRow = i;
                            minCol = j;
                        }
                    }
                }

                System.out.println("Максимальный элемент: " + maxElement + " в позиции (" + maxRow + ", " + maxCol + ")");
                System.out.println("Минимальный элемент: " + minElement + " в позиции (" + minRow + ", " + minCol + ")");
             break;
            }
            case 4_3:{
                System.out.print("Введите номер дня недели (1-7): ");
                int day = scanner.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Неправильный номер дня, введите число от 1 до 7.");}
                break;
            }
            case 44:{
                System.out.print("Введите столицу: ");
                String capital = scanner.next();

                switch (capital.toLowerCase()) {
                    case "марокко":
                        System.out.println("Страна: Марокко");
                        break;
                    case "париж":
                        System.out.println("Страна: Франция");
                        break;
                    case "москва":
                        System.out.println("Страна: Россия");
                        break;
                    case "вашингтон":
                        System.out.println("Страна: США");
                        break;
                    case "берлин":
                        System.out.println("Страна: Германия");
                        break;
                    default:
                        System.out.println("Неизвестная столица.");
                }
                break;
            }
            case 4_5:{
                System.out.print("Введите число n: ");
                int m = scanner.nextInt();

                int sum = 0;
                int current = 1;

                while (current <= m) {
                    if (current % 2 != 0) {
                        sum += current;
                    }
                    current++;
                }

                System.out.println("Сумма нечетных чисел от 1 до " + m + " равна: " + sum);
                break;
            }
            case 5:{
                int number = 11;

                do {
                    System.out.print(number + "\t");
                    number++;
                } while (number <= 51);
            break;}

            default:
                System.out.println("Введено неправильное значение");
        }
        scanner.close();
    }
}
