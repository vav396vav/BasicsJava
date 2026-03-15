package classes_and_methods_9.practical.skill.task2;

public class Main {
    public static void main(String[] args) {
        // === 1. Доступ к статическому полю БЕЗ создания объекта ===
        System.out.println("Число PI: " + MathUtils.PI);

        // === 2. Вызов статических методов БЕЗ создания объекта ===
        double earthRadius = 6371.0; // км

        double surfaceArea = MathUtils.calculateSurfaceArea(earthRadius);
        double equatorLength = MathUtils.calculateEquatorLength(earthRadius);

        // === 3. Вывод результатов ===
        System.out.println("Радиус Земли: " + earthRadius + " км");
        System.out.println("Площадь поверхности Земли: " + surfaceArea + " км²");
        System.out.println("Длина экватора Земли: " + equatorLength + " км");
    }
}
