package _11_Панаско_Денис_Віталійович.lab4;

public class Student {

    private String surname, name;
    private int course, mathGrade, physicsGrade;

    public Student(String my_surname, String my_name, int my_course, int my_mathGrade, int my_physicsGrade) {
        surname = my_surname;
        name = my_name;
        course = my_course;
        mathGrade = my_mathGrade;
        physicsGrade = my_physicsGrade;
    }

    public int PhysicsGrade() {
        return physicsGrade;
    }
    public int MathGrade() {
        return mathGrade;
    }
    public int Course() {
        return course;
    }
    public String Surname() {
        return surname;
    }
    public String Name() {
        return name;
    }

}
