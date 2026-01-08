package Final.addressbook.console;


import java.util.Scanner;

public class MenuNavigator {
    Scanner scanner = new Scanner(System.in);
    public int input;

//    public void start() {
//        System.out.println("""
//                Адресная книга
//
//                1 - Новый контакт.
//                2 - Удаление существующего контакта.
//                3 - Вывод всех контактов.
//                4 - Завершение работы.
//                """);
//        System.out.print("Введите нужную опцию и нажмите Enter [1.2.3.4]: ");
//
//        inputProcessing();
//
//
//    }
//
//    public void inputProcessing() {;
//
//        while (true) {
//            System.out.print("Выберите пункт (1–4): ");
//
//            if (scanner.hasNextInt()) {
//                input = scanner.nextInt();
//                if (input >= 1 && input <= 4) {
//                    switch (input) {
//                        case 1 -> System.out.println("Добавление контакта");
//                        case 2 -> System.out.println("Удаление контакта");
//                        case 3 -> System.out.println("Просмотр всех контактов");
//                        case 4 -> System.out.println("Выход");
//                    }
//                } else {
//                    System.out.println("Ошибка: число должно быть от 1 до 4.");
//                    System.out.println();
//                    start();
//                }
//            } else {
//                String badInput = scanner.next();
//                System.out.println("Ошибка: \"" + badInput + "\" — не число. Попробуйте снова.");
//                start();
//            }
//            break;
//        }
//
//        // Теперь choice гарантированно 1–4
//
//    }

    public void start() {
        while (true) { // ← один цикл на всё меню
            showMenu();
            int choice = readChoice(); // ← вынести в отдельный метод

            switch (choice) {
                case 1 -> System.out.println("Добавление контакта");
                case 2 -> System.out.println("Удаление контакта");
                case 3 -> System.out.println("Просмотр всех контактов");
                case 4 -> {
                    System.out.println("Работа программы завершена, ждём вас снова!");
                    return; // ← выйти из метода, не из цикла
                }
                default -> System.out.println("Выбрана неверная опция! Попробуйте заново.");
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

    private int readChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int c = scanner.nextInt();
                if (c >= 1 && c <= 4) return c;
                System.out.print("Ошибка: 1–4. Повторите: ");
            } else {
                String bad = scanner.next();
                System.out.print("Не число: \"" + bad + "\". Введите 1–4: ");
            }
        }
    }
}
