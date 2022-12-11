package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student studentOne = new Student("Tripp");
        studentOne.showGrades();
        studentOne.addGrades(92.3);
        studentOne.showGrades();
        studentOne.addGrades(72.5);
        studentOne.addGrades(82.1);
        studentOne.addGrades(77.6);
        studentOne.showGrades();
        studentOne.getGradeAverage();
        System.out.println(studentOne.getName());
    }
}
