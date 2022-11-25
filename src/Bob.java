import java.util.Objects;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean talking;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want?");
        do{
            System.out.println("I'm Listening");
            String prompt = scanner.nextLine();
            if (prompt.endsWith("?")){
                System.out.println("Sure");
            }
            else if (prompt.endsWith("!")){
                System.out.println("Whoa, Chill out!");
            }
            else if (prompt.length() ==  0){
                System.out.println("Fine, Be that way!");
            }
            else {
                System.out.println("Whatever");
            }


            System.out.println("Are we still talking?");
            talking = Objects.equals(scanner.nextLine(), "y");
        }
        while (talking);
        System.out.println("BYE!");
    }
}
