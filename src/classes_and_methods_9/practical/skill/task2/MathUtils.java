package classes_and_methods_9.practical.skill.task2;

public class MathUtils {
    // === 1. СТАТИЧЕСКОЕ ПОЛЕ PI ===
    public static final double PI;

    // === 2. СТАТИЧЕСКИЙ БЛОК ИНИЦИАЛИЗАЦИИ ===
    static {
        PI = 3.1415; // округлено до 4 знаков, как в ТЗ
        // Можно было: PI = Math.round(Math.PI * 10000) / 10000.0;
        // Но ТЗ явно говорит: 3.1415 → используем его
    }

    // === 3. СТАТИЧЕСКИЙ МЕТОД: площадь поверхности шара ===
    public static double calculateSurfaceArea(double radius) {
        // Формула: 4 * π * r²
        return 4 * PI * radius * radius;
    }

    // === 4. СТАТИЧЕСКИЙ МЕТОД: длина экватора (окружности) ===
    public static double calculateEquatorLength(double radius) {
        // Формула: 2 * π * r
        return 2 * PI * radius;
    }
}
