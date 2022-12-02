package fc.introduction.figures;

public class Rectangle extends Shape{

    public final double height;
    public final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        if (height <= 0) throw new RuntimeException("Error: the sides of the rectangle must be greater than zero.");
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return (2*width)+(2*height);
    }
}
