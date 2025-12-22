package Classes_and_Methods_8.qwen;

import ClassesAndMethods_8_1.qwen.model.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015);
        Car mercedes = new Car("Mercedes", "W124", 1988);
        Car bmw = new Car("BMW", "E30", 1985);

        System.out.println(lada.getHullName());
        System.out.println(lada.age());
        System.out.println(lada.isVintage());

        System.out.println(mercedes.getHullName());
        System.out.println(mercedes.age());
        System.out.println(mercedes.isVintage());

        System.out.println(bmw.getHullName());
        System.out.println(bmw.age());
        System.out.println(bmw.isVintage());
    }
}
