package loops_6;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade = 'B';
        switch (grade){
            case 'A' -> System.out.println("Отлично");
            case 'B' -> System.out.println("Хорошо");
            case 'C' -> System.out.println("Удовлетворительно");
            case 'D', 'E' -> System.out.println("Неудовлетворительно");
            default -> System.out.println("Некорректная оценка");
        }

        String text = switch (grade) {
            case 'A' -> "Отлично";
            case 'B' -> "Хорошо";
            case 'C' -> "Удовлетворительно";
            case 'D', 'E' -> "Неудовлетворительно";
            default -> "Некорректная оценка";
        };
        System.out.println(text);
    }
}
