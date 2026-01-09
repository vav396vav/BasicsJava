package Final.addressbook.console;

import Final.addressbook.service.AddressBook;

import java.util.Scanner;

public class MenuNavigator {
    private final Scanner scanner = new Scanner(System.in); // ← private final

    public void start() {
        while (true) {
            showMenu(); // ← всегда показываем меню при входе в цикл

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
//                    case 1 -> AddressBook.addContact();
                    case 2 -> System.out.println("Удаление контакта");
                    case 3 -> System.out.println("Просмотр всех контактов");
                    case 4 -> {
                        System.out.println("Работа программы завершена, ждём вас снова!");
                        scanner.close(); // ← хорошая практика
                        return;
                    }
                    default -> {
                        // ← при неверном числе (5, 0, -1)
                        System.out.println("Выбрана неверная опция! Попробуйте заново.");
                        System.out.println();
                        // цикл повторится → снова showMenu()
                    }
                }
            } else {
                // ← при не-числе ("abc", "@")
                String bad = scanner.next();
                System.out.println("Выбрана неверная опция! Попробуйте заново.");
                System.out.println();
                // цикл повторится → снова showMenu()
            }
        }
    }

    private void showMenu() {
        System.out.println("""
                Адресная книга
                
                1 – новый контакт
                2 – удаление существующего контакта
                3 – вывод всех контактов
                4 – завершение работы
                """);
        System.out.print("Введите нужную опцию и нажмите Enter [1..4]: ");
    }
}