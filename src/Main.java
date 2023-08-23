import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("\n Задача 1");
        // Условие задачи: Объявите три массива:Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями
        double[] fractions = {1.57, 7.654, 9.986d};

        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами
        int[] numbers = {4, 2, 6, 9, 23, 1, 5, 7, 8, 0, 1};

        System.out.println();
    }

    public static void task2() {
        System.out.println("\n Задача 2");
        /* Условие задачи:
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо
         */

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986d};
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] numbers = {4, 2, 6, 9, 23, 1, 5, 7, 8, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("\n Задача 3");
        /* Условие задачи:
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
         */

        // Первый массив
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = weights.length - 1; i > 0; i--) {
            System.out.print(weights[i] + ", ");
        }
        System.out.print(weights[0]);
        System.out.println();


        //Второй массив

        double[] fractions = {1.57, 7.654, 9.986};
        for (int i = fractions.length - 1; i > 0; i--) {
            System.out.print(fractions[i] + ", ");
        }
        System.out.print(fractions[0]);
        System.out.println();

        // Третий массив

        int[] numbers = {4, 2, 6, 9, 23, 1, 5, 7, 8, 0, 1};
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
            }
        System.out.print(numbers[0]);
        System.out.println();
        }
    public static void task4() {
        System.out.println("\n Задача 4");
        //Условие задачи: Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1)

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2!= 0) {
                weights[i] = weights[i] + 1;
            }
            System.out.println(weights[i]);
        }
    }
}