package classes_and_methods_9.practical.qwen.model;

import java.util.Objects;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int course;
    private final String group;
    private static int totalStudents = 0;

    public Student(String firstName, String lastName, int course, String group) {
         if (firstName == null || firstName.trim().isEmpty() ||
                 lastName == null || lastName.trim().isEmpty()){
             throw new IllegalArgumentException("Invalid name");
         }
         if (course < 1 || course > 6){
             throw new IllegalArgumentException("Invalid course");
         }
         if (group == null || group.trim().isEmpty()){
             throw new IllegalArgumentException("Invalid group");
         }
         this.firstName = firstName;
         this.lastName = lastName;
         this.course = course;
         this.group = group;

         totalStudents++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, group);
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
