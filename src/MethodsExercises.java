import java.util.Objects;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//
        System.out.println("Want to play a game? \"Y/N\"");
        String answer = scanner.nextLine();
        if (Objects.equals(answer, "y")){
            startRolling();
        }
//        factorial();
//        Addition(5,6);
//        Subtration(7,8);
//        Multiplication(5,5);
//        Division(8,2);
//        Modulous(5,2);
    }

//    public static void factorial(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        long userInput = Long.parseLong(scanner.nextLine());
//        if (userInput > 0 && userInput < 10){
//            System.out.printf("you entered %d", userInput);
//            System.out.println("\n Do you want to continue? \" Y/N ? \"");
//            String response = scanner.nextLine().toLowerCase();
//            if (Objects.equals(response, "y")){
//                int count = 1;
//                System.out.print(userInput + "! = ");
//                for (int i = (int)userInput, j = 1; i >= 0  ; i--, j++){
//
//                    if (i == 0){
//                        System.out.print( "   = " + count);
//                    }
//                    else{
//                        count *= j;
//                        if (i == 1){
//                            System.out.print(j);
//                        }
//                        else {
//                            System.out.print(j + " x ");
//                        }
//
//                    }
//
//                }
//            }
//        }
//        else {
//            System.out.print("You failed the assignment, try again \n");
//            factorial();
//        }
//    }
    public static void startRolling(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("How many sides to the dice you want to roll?");
       int sides = Integer.parseInt(scanner.nextLine());
       roll(sides);
        System.out.println("Do you want to play again?");
        String playAgain = scanner.next();
        if (Objects.equals(playAgain, "y")){
            startRolling();
        }

    }


    public static int random(int x){
        int min = 1;
        return  (int)Math.floor(Math.random()*(x-min+1)+min);

    }
    public static void roll(int sides){
        String rollOne = String.valueOf(random(sides));
        String rollTwo = String.valueOf(random(sides));
        System.out.println("your rolled "  + rollOne + " and " + rollTwo);
    }


//    public static void getInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        if (userInput > 0 && userInput < 10){
//            System.out.println("You did it, your hired");
//        }
//        else {
//            System.out.print("You failed the assignment, try again \n");
//            getInteger();
//        }
//    }
//    public static void Addition(int x, int y){
//        System.out.println(x+y);
//    }
//    public static void Subtration(int x, int y){
//        System.out.println(x-y);
//    }
//    public static void Multiplication(int x, int y){
//        System.out.println(x*y);
//    }
//    public static void Division(int x, int y){
//        System.out.println(x/y);
//    }
//    public static void Modulous(int x, int y){
//        System.out.println(x%y);
//    }
}
