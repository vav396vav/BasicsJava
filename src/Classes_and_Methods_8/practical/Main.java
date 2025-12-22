package Classes_and_Methods_8.practical;

import Classes_and_Methods_8.practical.model.Student;
import Classes_and_Methods_8.practical.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addGrade(new Student("Anna", 4), 58);
        studentService.addGrade(new Student("Katya", 6), 27);
        studentService.addGrade(new Student("Sergey", 8), 98);
        studentService.addGrade(new Student("Nikita", 2), 11);
        studentService.addGrade(new Student("Ivan", 9), 34);

        float average = studentService.getAverageGrade();
        Student best = studentService.getBestStudent();
        Student worst = studentService.getWorstStudent();

        System.out.printf("Средняя оценка: %.1f%n", average);
        System.out.println("Лучший студент: " + best.getName() + ", " + best.getClassNumbers() + " класс");
        System.out.println("Худший студент: " + worst.getName() + ", " + worst.getClassNumbers() + " класс");
    }

}
