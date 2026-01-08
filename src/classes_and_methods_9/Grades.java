package classes_and_methods_9;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        int sum = 0;
        int maxGrade = Integer.MIN_VALUE;

        System.out.print("Введите оценки: ");
        for(int i = 0; i < scores.length; i++){
            scores[i] = scanner.nextInt();
        }

        System.out.print("Оценки: ");
        for (int grade:scores){
            sum += grade;
            if (grade > maxGrade){
                maxGrade = grade;
            }
            System.out.print(grade + " ");
        }

        double average = (double) sum / scores.length;
        System.out.println();
        System.out.printf("Средний бал: %.1f%n", average); // ← 1 знак после запятой
        System.out.println("Максимальная оценка: " + maxGrade);
    }
}
