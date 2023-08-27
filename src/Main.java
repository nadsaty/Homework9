public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] bookKeeping = generateRandomArray();
        System.out.println("\n Задача 1 \n");

        for (int i : bookKeeping) {
            System.out.println("Сумма трат за месяц составила " + i + " рублей");
        }
    }

    public static void task2() {
        int[] bookKeeping = generateRandomArray();
        int max = -1;
        int min = 200001;
        System.out.println("\n Задача 2 \n");

        for (int i = 0; i < bookKeeping.length; i++) {
            if (bookKeeping[i] > max) {
                max = bookKeeping[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        for (int i = 0; i < bookKeeping.length; i++) {
            if (bookKeeping[i] < min) {
                min = bookKeeping[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }
}