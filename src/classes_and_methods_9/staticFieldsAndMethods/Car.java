package classes_and_methods_9.staticFieldsAndMethods;

public class Car {

    String brand = "Unknown";
    String color = "white";
    private int year;
    private static int vintageCount = 0;
    static int totalCreated = 0;


    public Car(String brand, String color) {
        this(brand, color, 2025);
        totalCreated++;
        System.out.println("Constructor: " + brand);
    }

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        if (year < 1886) {
            throw new IllegalArgumentException("Year too early");
        }
        this.year = year;
        if (year <= 1990){
            vintageCount++;
        }
        totalCreated++;
    }

    public int getYear(){
        return year;
    }

    public static int  getVintageCount(){
        return  vintageCount;
    }


    public void printInfo() {
        String info = brand + " (" + color + ")";
        System.out.println(info + " - всего создано: " + totalCreated);
    }
}
