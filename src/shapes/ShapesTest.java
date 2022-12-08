package shapes;

public class ShapesTest {
    public static void main(String[] args) {


//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter()+" , " + box1.getArea() );
//        Rectangle box2 = new Rectangle(5);
//        System.out.println(box2.getPerimeter()+" , " + box2.getArea() );



        Measurable myShape = new Rectangle(6, 8) {
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(5){
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}
