package classes_and_methods_9.lombok;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("John");
        student1.setAge(20);
        student1.setGroup("A");
        System.out.println(student1);

        student2.setName("Mary");
        student2.setAge(21);
        student2.setGroup("B");
        System.out.println(student2);

        System.out.println(student1.equals(student2));

    }
}
