public class MathOperations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return (double) a / b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Демонстрация математических операций ===");

        int x = 15;
        int y = 3;

        System.out.println("Числа: " + x + " и " + y);
        System.out.println("Сложение: " + add(x, y));
        System.out.println("Вычитание: " + subtract(x, y));
        System.out.println("Умножение: " + multiply(x, y));
        System.out.println("Деление: " + divide(x, y));

        System.out.println("\nДополнительные вычисления:");
        System.out.println("Число 10 четное? " + isEven(10));
        System.out.println("Число 7 четное? " + isEven(7));
        System.out.println("Факториал числа 5: " + factorial(5));

        try {
            System.out.println("Проверка деления на ноль: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Перехвачена ошибка: " + e.getMessage());
        }

        System.out.println("===========================================");
    }
}