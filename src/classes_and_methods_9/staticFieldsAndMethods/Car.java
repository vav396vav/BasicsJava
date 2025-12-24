package classes_and_methods_9.staticFieldsAndMethods;

public class Car {
    static {
        System.out.println("Static block");
    }

    static int count = 0;

    {
        System.out.println("Instance block");
    }

    String brand = "Unknown";

    public Car(String brand) {
        this.brand = brand;
        count++;
        System.out.println("Constructor: " + brand);
    }
}
