package classes_and_methods_9.classObject.model;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final int year;
    private static int totalCount = 0;

    // Конструктор с валидацией
    public Book(String title, String author, int year) {
        // Проверка title: не null и не пустая (даже после trim)
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        // Проверка author: не null и не пустая
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        // Проверка year: неотрицательный
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative");
        }

        // Присваиваем значения полям
        this.title = title.trim();   // убираем лишние пробелы по краям
        this.author = author.trim(); // —||—
        this.year = year;

        totalCount++;

    }

    // Геттеры (по JavaBean convention)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Переопределение toString() — уже сделано корректно
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")";
    }

    // Переопределение equals()
    @Override
    public boolean equals(Object o) {
        // 1. Если это один и тот же объект в памяти — сразу true
        if (this == o) {
            return true;
        }

        // 2. Если передали null ИЛИ объект другого класса — false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // 3. Приводим o к типу Book (безопасно, т.к. проверили getClass())
        Book book = (Book) o;

        // 4. Сравниваем year — примитив, просто ==
        boolean yearsEqual = this.year == book.year;

        // 5. Сравниваем title и author БЕЗ УЧЁТА РЕГИСТРА
        // Objects.equals(a, b) — безопасно при null (возвращает true, если оба null)
        // .equalsIgnoreCase() — игнорирует регистр: "война" == "Война"
        boolean titlesEqual = Objects.equals(this.title, book.title) &&
                this.title.equalsIgnoreCase(book.title);
        boolean authorsEqual = Objects.equals(this.author, book.author) &&
                this.author.equalsIgnoreCase(book.author);

        // 6. Возвращаем результат: все три поля должны совпадать
        return yearsEqual && titlesEqual && authorsEqual;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return year == book.year &&
//                title.equalsIgnoreCase(book.title) &&
//                author.equalsIgnoreCase(book.author);
//    }

    // 🔑 КЛЮЧЕВОЙ МЕТОД: hashCode()
    @Override
    public int hashCode() {
        // Objects.hash() — удобный хэш из нескольких полей
        // НО: если equals() игнорирует регистр — hashCode() тоже должен!
        // Поэтому приводим к нижнему регистру
        return Objects.hash(
                title.toLowerCase(),   // ← "Война" → "война"
                author.toLowerCase(),  // ← "Л. Толстой" → "л. толстой"
                year
        );
    }

    // 🔍 Статический метод для проверки контракта equals/hashCode
    // Аналог unit-теста — как в JUnit, но вручную
    public static void validateContract(Book b1, Book b2) {
        boolean eq = b1.equals(b2);
        int h1 = b1.hashCode();
        int h2 = b2.hashCode();

        // Контракт Java: если a.equals(b) == true → a.hashCode() == b.hashCode()
        if (eq && h1 != h2) {
            throw new AssertionError(
                    "Contract violated: equals=true, but hashCode differs\n" +
                            "  b1 = " + b1 + " (hashCode=" + h1 + ")\n" +
                            "  b2 = " + b2 + " (hashCode=" + h2 + ")"
            );
        }
    }

    public static int getTotalCount(){
        return totalCount;
    }

    static {
        System.out.println("Book class initialized.");
    }
}