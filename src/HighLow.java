import java.util.Objects;
import java.util.Scanner;

//Scanner scanner = new Scanner(System.in);


public class HighLow {
    public static void main(String[] args) {
        welcome();

    }

    public static void welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game High or low");
        wait(1);
        System.out.println("The computer will generate a number between 1 and 100");
        wait(1);
        System.out.println("Its your job to guess the number be guessing higher or lower");
        wait(1);
        System.out.println("Type \"Y\" if you would like to play");
        String letsPlay = scanner.nextLine().toLowerCase();
        if (Objects.equals(letsPlay, "y")){
            start();
        }


    }
    public static void start(){
        System.out.println("The computer is generating a number.....");
        wait(1);
        System.out.println("Beep .... Boop");
        wait(1);
        System.out.println("Ok, its ready.");
        gameStart();
    }

    public static void gameStart(){
        int gameWinner = randomStarter();
        do {
            guessLoop(gameWinner);
        }
        while (!guessLoop(gameWinner));
        winning();
    }

    public  static void winning(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You win!");
        wait(1);
        System.out.println("Type \"Y\" if you would like to play again");
        String playAgain  = scanner.nextLine().toLowerCase();
        if (Objects.equals(playAgain, "y")){
            start();
        }
        else{
            System.out.println("Thanks for stopping by, come back and play again");
        }
    }

    public  static boolean guessLoop(int gameWinner){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your guess?");
        String UserGuess = scanner.nextLine();
        if (isValid(UserGuess)){
            int UserGuessNum  = Integer.parseInt(UserGuess);
            if (UserGuessNum > gameWinner){
                System.out.println("Guess lower");
                return false;
            }
            else if (UserGuessNum < gameWinner) {
                System.out.println("Guess Higher");
                return false;
            }
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValid(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            System.out.println("This is not a valid entry");
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid entry");
        }
        return false;
    }

    public static int randomStarter(){
        return  (int)Math.floor(Math.random()*(100-1+1)+1);
    }


    public static void wait(int secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000L);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

}


