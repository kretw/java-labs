package task6;

public class Main {
    public static void main(String[] args) {
        String input = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String result = replaceEverySecondOccurrence(input, "object-oriented programming", "OOP");
        System.out.println(result);
    }

    public static String replaceEverySecondOccurrence(String input, String target, String replace) {
        String lowerCaseInput = input.toLowerCase();
        String lowerCaseTarget = target.toLowerCase();
        int count = 0;
        StringBuilder result = new StringBuilder();
        int start = 0;

        while (true) {
            int index = lowerCaseInput.indexOf(lowerCaseTarget, start);
            if (index == -1) {
                result.append(input.substring(start));
                break;
            }
            count++;
            if (count % 2 == 0) {
                result.append(input.substring(start, index));
                result.append(replace);
            } else {
                result.append(input.substring(start, index + target.length()));
            }
            start = index + target.length();
        }

        return result.toString();
    }
}

