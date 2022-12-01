package shapes;

import util.Input;



public class CircleApp {
    public static int created = 0;
    public static void main(String[] args) {

       startApp();
    }
    public static void startApp(){
        Input user = new Input();
        System.out.println("Lets make the circle! \n What is the radius? \n");
        double userDouble = user.getDouble();
        Circle circle = new Circle(userDouble);
        System.out.println("Your circumference is: " + circle.getCircumference() + "\n Your area is: " + circle.getArea());
        System.out.println("do you want to continue?");
        created ++;
        if(user.yesNo()){startApp(); return;}
        System.out.println(created + " circles created");;
    }
}
