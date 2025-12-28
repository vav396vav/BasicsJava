package classes_and_methods_9.practical.qwen;

import classes_and_methods_9.practical.qwen.model.Student;
import classes_and_methods_9.practical.qwen.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // Создаём студентов
        Student s1 = new Student("Иван", "Иванов", 2, "Java-58");
        Student s2 = new Student("Мария", "Петрова", 2, "Java-58");
        Student s3 = new Student("Алексей", "Сидоров", 2, "Java-58");

        // Добавляем
        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);

        // Выводим статистику
        System.out.println("Всего студентов (service): " + service.getTotalStudents());
        System.out.println("Всего студентов (static): " + Student.getTotalStudents());

        // Выводим всех
        System.out.println("Список студентов:");
        for (Student s : service.getAllStudents()) {
            System.out.println(s); // вызовет toString()
        }

        // Поиск
        Student found = service.findStudentByFullName("Иван Иванов");
        System.out.println("Найден: " + found);
    }
}
