import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1-2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] number = {1.57, 7.654, 9.986};

        int[] age = new int[3];
        for (int i = 0; i < age.length; i++) {
            age[i] = i + 2;
        }

        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }

        for (int i = 0; i < age.length; i++) {
            if (i == age.length - 1) {
                System.out.println(age[i]);
                break;
            }
            System.out.print(age[i] + ", ");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] number = {1.57, 7.654, 9.986};

        int[] age = new int[3];
        for (int i = 0; i < age.length; i++) {
            age[i] = i + 2;
        }

        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }

        for (int i = number.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }


        for (int i = age.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(age[i]);
                break;
            }
            System.out.print(age[i] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }


}