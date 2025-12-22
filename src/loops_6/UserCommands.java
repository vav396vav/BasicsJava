package loops_6;

import java.time.LocalTime;
import java.util.Scanner;

public class UserCommands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String cmd = sc.nextLine();
            switch (cmd) {
                case "help" -> System.out.println("Доступны: help, hello, time, exit");
                case "exit" -> {
                    System.out.println("До свидания!");
                    return;
                }
                case "hello" -> System.out.println("Привет!");
                case "time" -> System.out.println(LocalTime.now().toString().substring(0, 8));
                default -> System.out.println("Неизвестная команда: " + cmd);
            }
        }
    }
}
