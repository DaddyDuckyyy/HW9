import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = generateRandomArray();
        int result = 0;
        for (int anInt : ints) {
            result += anInt;
        }
        System.out.println(result);
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_001) + 100_000;
        }
        return arr;
    }
}
