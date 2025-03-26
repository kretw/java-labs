import java.util.Random;

public class WeightedRandomSelector {

    private int[] values; //массив, значений для выбора
    private int[] weights; // массив, весов
    private Random random;

    public WeightedRandomSelector(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        this.random = new Random(); //конструктор
    }

    public int getRandomValue() {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight; //проходим по массиву и подсчитываем общий вес
        }

        int randomValue = random.nextInt(totalWeight);
        for (int i = 0; i < weights.length; i++) {
            if (randomValue < weights[i]) {
                System.out.println("Выбрано значение: " + values[i]);
                return values[i];
            }
            randomValue -= weights[i];
        } // проходим по массиву вейтс, если число меньше значения текущего веса, то ок, если нет продолжаем цикл

        return values[values.length - 1]; // возврат значения по умолчанию(массив валуе)
    }

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
                int[] weights = {1, 2, 10};

                WeightedRandomSelector selector = new WeightedRandomSelector(values, weights); // экземпляр класса
        for (int i = 0; i < 10; i++) {
            selector.getRandomValue(); //выбираем несколько раз для наглядности
        }
    }
}