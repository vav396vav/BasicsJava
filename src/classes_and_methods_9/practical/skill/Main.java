package classes_and_methods_9.practical.skill;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Саша", 19);
        Person person2 = new Person("Вика", 20);
        Person person3 = new Person("саша", 19);

        System.out.println(person1.toString() +
                " Это один абонент с: " +
                person2.toString() +
                person1.equals(person2));

        System.out.println(person1 + " и " + person2 +
                " — один и тот же? " + person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person3.hashCode());
    }
}
