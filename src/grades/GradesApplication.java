package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import util.Input;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student Tripp = new Student("Tripp");
        Tripp.addGrades(80);
        Tripp.addGrades(90);
        Tripp.addGrades(70);
        Tripp.addGrades(60);

        students.put("TripperDipper07", Tripp);

        Student Molly = new Student("Molly");
        Molly.addGrades(65);
        Molly.addGrades(90);
        Molly.addGrades(78);
        Molly.addGrades(93);

        students.put("HollyMolly22", Molly);

        Student Jeff = new Student("Jeff");
        Jeff.addGrades(65);
        Jeff.addGrades(78);
        Jeff.addGrades(92);
        Jeff.addGrades(99);

        students.put("JeffCodeBloom", Jeff);

        Student Justin = new Student("Justin");
        Justin.addGrades(88);
        Justin.addGrades(93);
        Justin.addGrades(67);
        Justin.addGrades(83);

        students.put("JustinCeeder", Justin);

        System.out.println("Welcome to the student portal");

        startApp(students);

    }

    public static void printKeys(HashMap<String, Student> entry){
        System.out.println("Student gitHub accounts:");
        for (Map.Entry<String, Student> e: entry.entrySet()) {
            System.out.println("- "+e.getKey());
        }
    }

    public static void startApp(HashMap<String, Student> entry){
        System.out.println("Please enter the desired github user.");
        System.out.println("Or enter \" Options \" if you want to see available users on file and other commands.");
        String answer = Input.getString();
        switch (answer.toLowerCase()) {
            case "options":
                printKeys(entry);
                System.out.println("- Class_Average");
                System.out.println("---- Exit ----");
                startApp(entry);
                break;
            case "class_average":
                System.out.println(classAverage(entry));
                startApp(entry);
                break;
            case "exit":
                System.out.println("Thank you for using Your Grading App!");
                break;
            default:
                if (entry.containsKey(answer)) {
                    System.out.println("Name: " + entry.get(answer).getName() + "\n Current Grades are: " + entry.get(answer).showGrades() + "\n Grade average is: " + entry.get(answer).getGradeAverage());
                    System.out.println("Do you want to look at something else?");
                    if (Input.yesNo()) {
                        startApp(entry);
                    } else {
                        System.out.println("Thank you for using Your Grading App!");
                    }
                } else {
                    System.out.println("Not a valid entry. Please try again");
                    startApp(entry);
                }
                break;
        }

    }


    public static double classAverage(HashMap<String, Student> entry){
        double classAverage =0;
        int classSize = 0;
        for (Map.Entry<String, Student> e: entry.entrySet()) {
            classSize ++;
            String temp = e.getKey();
            classAverage += entry.get(temp).getGradeAverage();
        }
        return classAverage/classSize;
    }
}
