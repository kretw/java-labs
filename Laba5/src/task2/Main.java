package task2; //Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".

public class Main {
    public static void main(String[] args) {
        System.out.println(getMiddleCharacters("string"));  // "ri"
        System.out.println(getMiddleCharacters("cod"));    // "od"
        System.out.println(getMiddleCharacters("Practice"));// "ct"
    }

    public static String getMiddleCharacters(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length();
            int middle = length / 2;
            return str.substring(middle - 1, middle + 1);
        } else {
            int length = str.length();
            int middle = length / 2;
            return str.substring(middle);
        }
    }
}


