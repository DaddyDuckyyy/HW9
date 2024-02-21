import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task23();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_001) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int result = 0;
        for (int anInt : arr) {
            result += anInt;
        }
        System.out.println("Сумма выплат за месяц " + result + " p.");
    }

    public static void task23() {
        int[] expenses = generateRandomArray();
        int totalExpenses = 0;
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];
        for (int expense : expenses) {
            totalExpenses += expense;
            if (expense < minExpenses) {
                minExpenses = expense;
            }
            if (expense > maxExpenses) {
                maxExpenses = expense;
            }
        }
        System.out.println("Сумма трат за месяц: " + totalExpenses + " p.");
        System.out.println("Минимальная сумма трат в день: " + minExpenses + " p.");
        System.out.println("Максимальная сумма трат в день: " + maxExpenses + " p.");
        System.out.println("Средняя сумма трат за месяц: " + (double) totalExpenses / expenses.length + " p.");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
