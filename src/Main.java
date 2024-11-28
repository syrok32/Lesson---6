public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //задание 1
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " Год является високосным");
        }
        System.out.println("Задание 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задание 8");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 9");

        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 += (total2 + salary) * 1.01;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            answer = 2 * i;

            System.out.println("2*" + i + "=" + answer);
        }


    }
}