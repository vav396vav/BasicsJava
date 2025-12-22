package loops_6;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int attempts = 0;

        while (true) {
            System.out.print("Введите число от 1 до 10: ");
            number = scanner.nextInt();
            attempts++;
            if (number >= 1 && number <= 10){
                System.out.println("OK: " + number);
                System.out.println("Попыток: " + attempts);
                return;
            } else {
                System.out.println("Не в диапазоне. Повторите.");
            }
        }
    }
}
