package classes_and_methods_9.classObject;

import classes_and_methods_9.classObject.model.Book;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаём книги
        System.out.println("До создания книг: " + Book.getTotalCount());
        Book b1 = new Book("1984", "Дж. Оруэлл", 1949);
        Book b2 = new Book("1984", "Дж. Оруэлл", 1949); // дубликат
        Book b3 = new Book("война и мир", "л. толстой", 1869);
        Book b4 = new Book("Война и Мир ", "Л. Толстой", 1869); // дубликат (регистр)
        System.out.println("После создания книг: " + Book.getTotalCount());

        // Проверка контракта
        Book.validateContract(b1, b2); // ✅ одинаковые
        Book.validateContract(b3, b4); // ✅ одинаковые (регистр проигнорирован)
        // Book.validateContract(b1, b3); // не проверяем — equals=false → контракт не требует равенства hash

        // Проверка в HashSet
        Set<Book> library = new HashSet<>();
        library.add(b1);
        library.add(b2); // не добавится — дубликат
        library.add(b3);
        library.add(b4); // не добавится — дубликат

        System.out.println("Количество уникальных книг: " + library.size());
        System.out.println("Содержимое библиотеки:");
        for (Book book : library) {
            System.out.println("  - " + book);
        }
    }
}