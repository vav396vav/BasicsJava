package Classes_and_Methods_8.practical.service;

import Classes_and_Methods_8.practical.model.Student;

public class StudentService {
    private int studentCount = 0;
    private int sumOfScores = 0;
    private Student bestStudent = null;
    private Student worstStudent = null;
    private int maxGrade = Integer.MIN_VALUE;
    private int minGrade = Integer.MAX_VALUE;


    public void addGrade(Student student, int grade){
        studentCount ++;
        sumOfScores +=grade;

        if (grade > maxGrade){
            maxGrade = grade;
            bestStudent = student;
        }

        if(grade < minGrade){
            minGrade = grade;
            worstStudent = student;
        }
    }

    public float getAverageGrade(){
        if(studentCount == 0){
            return 0;
        }
        return (float) sumOfScores / studentCount;
    }

    public Student getBestStudent(){
        return bestStudent;
    }

    public Student getWorstStudent(){
        return worstStudent;
    }
}
