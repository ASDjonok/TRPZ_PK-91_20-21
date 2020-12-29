package _11_Панаско_Денис_Віталійович.lab4;

public class Main {
    public static void sorted_by_physics_grade(Student[] mas) {    //        from minimum to maximum

        Student temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1 ; j++) {
                if (mas[j].PhysicsGrade() >= mas[j + 1].PhysicsGrade()) {
                    temp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = temp;
                }
            }
        }
    }
    public static void sorted_by_MathGrade(Student[] mas) {    //        from maximum to minimum

        Student temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1 ; j++) {
                if (mas[j].MathGrade() <= mas[j + 1].MathGrade()) {
                    temp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = temp;
                }
            }
        }
    }


    public static void array_output(Student[] mas) {
        int number = 1;
        for (Student i : mas) {
            System.out.printf(number + " Студент:" + "%10s" + "%10s" + "%2d" + "%4d" + "%4d" + "\n", i.Name(), i.Surname(), i.Course(), i.MathGrade(), i.PhysicsGrade());
            number++;
        }
    }

    public static void main(String[] args) {

        Student firstStudent = new Student("Рудов", "Ярик", 2, 70, 94);
        Student secondStudent = new Student("Акуленко", "Александр", 2, 80, 93);
        Student thirdStudent = new Student("Белак", "Артур", 5, 96, 100);
        Student[] masStudent = {firstStudent, secondStudent, thirdStudent};
        System.out.println("начальная массив\n");
        array_output(masStudent);

        System.out.println("\nотсортировали по оценке с физики от min к max ");
        sorted_by_physics_grade(masStudent);
        System.out.println();

        array_output(masStudent);

        System.out.println("\nотсортировали по оценке с математики от max к min\n");
        sorted_by_MathGrade(masStudent);
        array_output(masStudent);




    }
}
