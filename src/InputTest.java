import util.Input;

public class InputTest {
    public static void main (String[] args){
        Input testing = new Input();

        int testI = testing.getInt();
        System.out.println(testI);

        double testD = testing.getDouble();
        System.out.println(testD);

        int testI2 = testing.getInt(0,20);
        System.out.println(testI2);

        double testD2 = testing.getDouble(0, 10.5);
        System.out.println(testD2);


        boolean testB = testing.yesNo();
        System.out.println(testB);

        String test1 = testing.getString();
        System.out.println(test1);

    }
}
