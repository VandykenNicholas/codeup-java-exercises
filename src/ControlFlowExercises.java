import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15){
//            System.out.printf("Your number is now %d %n", i);
//            i++;
//        }
//
//
////    }
//        int i = 0;
//        do {
//            System.out.printf("the number is now %d %n", i);
//            i += 2;
//        }
//        while (i <= 100);
//        int i = 100;
//
//        do {
//            System.out.printf("the number is now %d %n", i);
//            i -=5;
//        }
//        while (i >= -10);

//        long lineNew = 2;
//
//        do{
//            System.out.println(lineNew);
//            lineNew  =  lineNew * lineNew;
//
//        }
//        while (lineNew < 1000000);

//        for (int i = 5; i <=15; i++){
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i = i * i){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else if (i%5 == 0){
//                System.out.println("Buzz");
//            }
//        }
        System.out.println("How many rows should we go?");
        int rows = Integer.parseInt(scanner.nextLine());
        int controller = rows;
        System.out.println("Here is the table!");
        System.out.printf("%n Number | Squared | Cubed %n ------ | ------- | ----- ");
        for (int i = 1; i <= rows; i++){
            System.out.printf("%n%-8d|%-9d| %-5d", i, i*i, i*i*i);
            if (i == rows){
                controller = i + 1;
            }
        }
        System.out.println("\nWould you like to continue? Enter \"y\" ");
        String more = scanner.nextLine();
        while (Objects.equals(more, "y")){
            for (int i = controller; i <= controller + (rows -1) ; i++){
                System.out.printf("%n%-8d|%-9d| %-5d", i, i*i, i*i*i);
                if (i == controller + (rows - 1)){
                    controller = i + 1;
                    break;
                }
            }
            System.out.println("\nWould you like to continue? Enter \"y\" ");
            more = scanner.nextLine();
        }
        System.out.println("Come back if you want some more");
//        boolean more = true;
//        String result = "";
//        int grade = 0;
//        do {
//            System.out.println("Input the grade to be reported");
//            grade  = Integer.parseInt(scanner.nextLine());
//            if (grade >= 90){
//                result = "A";
//            }
//            else if (grade >= 80 && grade < 90){
//                result = "B";
//            }
//            else if (grade >= 70 && grade < 80){
//                result = "C";
//            }
//            else if (grade >= 60 && grade < 70){
//                result = "D";
//            }
//            else {
//                result = "F";
//            }
//            System.out.printf("The grade inputted is %s %n", result);
//            System.out.println("Do you want to continue?");
//            String moreGrades = scanner.nextLine();
//            if (!Objects.equals(moreGrades, "y")){
//                more = false;
//            }
//
//        }
//        while (more);
//        System.out.println("Thank you for using the reporting system, Goodbye");

        }

}
