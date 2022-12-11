package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Double> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Double>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrades(double grade){
        this.grades.add(grade);
    }

    public String showGrades(){
        StringBuilder print = new StringBuilder();
        for (double g : this.grades){
            print.append("\n");
            print.append(g);
        }
        return print.toString();
    }

    public double getGradeAverage(){
        double sum = 0;
        for(double g : this.grades){
            sum += g;
        }
        return  sum/this.grades.size();
    }

}
