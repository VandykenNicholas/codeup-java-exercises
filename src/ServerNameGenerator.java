import util.usful;

import java.util.Arrays;

public class ServerNameGenerator {
    static String[] nouns = {"Airport", "Hair", "Piano", "Helicopter", "Answer", "Planet", "Animal", "Hamburger", "guitar", "Pillow"};
    static String[] adj = {"busy", "clumsy", "careful", "colorful", "calm", "cautious", "clean", "cheerful", "charming", "adorable"};



    public static void main(String[] args) {
        System.out.println("your server name is:\n"+  randomReturn(nouns, adj));
    }


    public static String randomReturn(String[] noun, String[] adj){
        int randomNum = usful.random(noun.length);
        String randomOne = noun[randomNum -1];
        int randomNum2 = usful.random(adj.length);
        String randomTwo = adj[randomNum2 -1];
        return randomTwo + " " + randomOne;
    }

}
