import java.util.Objects;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tom = "We don't need no education";
        System.out.printf("%s %n", tom);
        tom = "We dont need no thought control";
        System.out.println(tom);

        String s = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(s);
        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);
        String back = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(back);
    }
}
