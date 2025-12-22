package loops_6;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    Введите команду: 
                    1.Привет
                    2.Пока
                    0.Выход
                    """);

        while(true){
            String cmd = sc.next();
            switch (cmd){
                case "1" -> System.out.println("Здравствуйте!");
                case "2" -> System.out.println("До встречи!");
                case "0" ->{
                    System.out.println("Работа завершена!");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
