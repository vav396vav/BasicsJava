package Classes_and_Methods_8.qwen.model;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int age(){
        return 2025 - this.year;
    }

    public boolean isVintage(){
        if (age() >= 30){
            return true;
        } else {
            return false;
        }
    }

    public String getHullName(){
        return brand + " " + model + " " + (year);
    }
}
