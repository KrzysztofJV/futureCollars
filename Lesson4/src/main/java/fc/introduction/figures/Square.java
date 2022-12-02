package fc.introduction.figures;

public class Square extends Rectangle{

    public Square(double width) {
        super(width, width);
        if (width <= 0) throw new RuntimeException("Error: the side of the square must be greater than zero.");
    }

    @Override
    public double getArea() {
        return (Math.pow(width,2));
    }

    @Override
    public double getPerimeter() {
        return 4*width;
    }
}
