package shapes;

public class  Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }

    public double getPerimeter() {
        return length * 4;
    }

    public double getArea() {
        return length * length;
    }
//    protected int side;
//
//    public Square(int side) {
//         super(side, side);
//         this.side = this.length;
//    }
//
//    @Override
//    public int getArea() {
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }



}
