package task5;

public class Main {
    public static void main(String[] args) {
        String input = "Если есть хвосты по дз, начните с 1 несданного задания. 123 324 111 4554";

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isNumeric = true;
            for (int j = 0; j < word.length(); j++) {
                if (!Character.isDigit(word.charAt(j))) {
                    isNumeric = false;
                    break;
                }
            }
            if (isNumeric && isPalindrome(word)) {
                System.out.println("Найдено слово-палиндром: " + word);
            }
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

