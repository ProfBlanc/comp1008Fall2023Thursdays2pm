package wk4;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private double grade;

    private static final int MIN_AGE_ELEMENTARY_STUDENT = 5;
    private static final int MAX_AGE_ELEMENTARY_STUDENT = 13;

    private static Random random = new Random();

    public Student(){}

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static Student elementarySchoolStudent(){
        return null;
    }
    public static Student elementarySchoolStudent(String name){
        double grade = random.nextInt(50, 101);
        return elementarySchoolStudent(name, grade);
    }
    public static Student elementarySchoolStudent(String name, double grade){
        int age = random.nextInt(MIN_AGE_ELEMENTARY_STUDENT, MAX_AGE_ELEMENTARY_STUDENT + 1);
        return elementarySchoolStudent(name, age, grade);
    }
    public static Student elementarySchoolStudent(String name, int age, double grade){
        age = age >= MIN_AGE_ELEMENTARY_STUDENT && age <= MAX_AGE_ELEMENTARY_STUDENT
                ? age : MIN_AGE_ELEMENTARY_STUDENT;
        return new Student(name, age, grade);
    }
    //elementarySchoolStudent
    //highSchoolStudent
    //postSecondaryStudent
    public static Student honorRollStudent(String name, int age, double grade){
        return new Student(name, age, grade >= 80 ? grade : 80);
    }
    public static Student postSecondaryStudent(){

        return new Student("Georgian College Student",
                random.nextInt(17, 101),
                random.nextInt(50, 101));
    }


    @Override
    public String toString(){
        return String.format("Name = %s, Age = %d, Grade = %.1f",name, age, grade);
    }
}
