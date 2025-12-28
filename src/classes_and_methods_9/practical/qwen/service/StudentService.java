package classes_and_methods_9.practical.qwen.service;

import classes_and_methods_9.practical.qwen.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentService {
    // Приватное поле — инкапсуляция
    private final List<Student> students = new ArrayList<>();

    // Добавление студента
    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("student cannot be null");
        }
        students.add(student);
    }

    // Возврат КОПИИ списка — защита от изменения извне
    public List<Student> getAllStudents() {
        return new ArrayList<>(students); // копия
        // Или: return Collections.unmodifiableList(students); // неизменяемый view
    }

    // Общее число
    public int getTotalStudents() {
        return students.size();
    }

    // Поиск по полному имени
    public Student findStudentByFullName(String fullName) {
        if (fullName == null) return null;

        for (Student student : students) {
            if (fullName.equals(student.getFullName())) {
                return student;
            }
        }
        return null; // не найден
    }
}
