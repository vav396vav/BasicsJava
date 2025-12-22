package loops_6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите действие: ");
        String operation = sc.next();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        double result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b == 0 ? Double.NaN : a / b;
            default -> Double.NaN;
        };
        System.out.println(result);
    }
}
