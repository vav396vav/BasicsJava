package classes_and_methods_9.classObject;

import classes_and_methods_9.classObject.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Л. Толстой", 1869);
        Book book2 = new Book("1984", "Дж. Оруэлл", 1949);

        System.out.println(book1);
        System.out.println(book2);
    }
}
