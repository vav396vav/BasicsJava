package classes_and_methods_9.staticFieldsAndMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Создаём первый Car ---");
        Car c1 = new Car("Lada", "red");
        c1.printInfo();

        System.out.println("--- Создаём второй Car ---");
        Car c2 = new Car("Toyota", "blue");
        c2.printInfo();

        new Car("Ford T", "black", 1908);
        new Car("Lada", "red", 1985);
        new Car("Tesla", "silver", 2023);

        System.out.println("Всего машин: " + Car.totalCreated);
        System.out.println("Винтажных: " + Car.getVintageCount());
    }
}
