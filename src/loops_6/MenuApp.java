package loops_6;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        // ① Создаём Scanner — он будет использоваться во всех ветках
        Scanner sc = new Scanner(System.in);

        // ② Бесконечный цикл — приложение работает, пока пользователь не выберет "0"
        while (true) {
            // ③ Выводим меню ПЕРЕД каждым вводом (UX: пользователь всегда видит варианты)
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Сумма чётных чисел до N");
            System.out.println("2. Сколько лет до удвоения вклада");
            System.out.println("0. Выход");
            System.out.print("Выберите: ");

            // ④ Читаем выбор как строку (sc.next() — безопасно, не ловит \n)
            String choice = sc.next();

            // ⑤ Обрабатываем выбор через switch
            switch (choice) {
                // ▼ Задача 1: сумма чётных
                case "1" -> {
                    // Запрашиваем N
                    System.out.print("Введите N: ");
                    int n = sc.nextInt();  // nextInt() — читает целое, не оставляет мусора

                    // Считаем сумму чётных от 1 до n
                    int sum = 0;
                    for (int i = 2; i <= n; i += 2) {  // шаг 2 — только чётные
                        sum += i;
                    }

                    // Выводим результат
                    System.out.println("Сумма: " + sum);
                    // Программа НЕ завершается — цикл продолжится, меню покажется снова
                }

                // ▼ Задача 2: годы до удвоения
                case "2" -> {
                    // Запрашиваем ставку в процентах (например, 7.5)
                    System.out.print("Введите годовую ставку (%): ");
                    double ratePercent = sc.nextDouble();  // 7.5

                    // Переводим в долю: 7.5% → 0.075
                    double rate = ratePercent / 100.0;

                    // Начальные значения
                    double current = 1.0;  // можно 1000.0 — но множитель не важен
                    double target = 2.0;   // удвоение → 1 → 2
                    int years = 0;

                    // Цикл: пока не достигли цели
                    while (current < target) {
                        current = current * (1 + rate);  // начисление %
                        years++;
                    }

                    // Выводим результат
                    System.out.println("Лет до удвоения: " + years);
                }

                // ▼ Выход
                case "0" -> {
                    System.out.println("Спасибо за использование!");
                    return;  // мгновенный выход из main — программа завершается
                }

                // ▼ Любая другая команда
                default -> {
                    System.out.println("Ошибка выбора.");
                }
            }
            // ← после любого case (кроме "0") — цикл повторяется: снова меню
        }
    }
}