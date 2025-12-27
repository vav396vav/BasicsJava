package Classes_and_Methods_8.practical.model;

public class Student {
    private String name;
    private int classNumbers;
    int classNumber;

    public Student(String name, int classNumbers){
        this.name = name;
        this.classNumbers = classNumbers;
    }

    public String getName() {
        return name;
    }

    public int getClassNumbers(){
        return classNumbers;
    }
}
