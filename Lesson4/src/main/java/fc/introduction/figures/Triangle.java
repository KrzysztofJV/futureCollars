package fc.introduction.figures;

public class Triangle extends Shape{

    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

        if (firstSide<=0 || secondSide<=0 || thirdSide<=0)
            throw new RuntimeException("Error: the sides of the triangle must be greater than zero.");
    }

    //The heron's pattern was used to calculate triangle area.
    @Override
    public double getArea() {
        double halfPerimeterTriangle = (firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(halfPerimeterTriangle * (halfPerimeterTriangle - firstSide) *
                (halfPerimeterTriangle - secondSide) *
                (halfPerimeterTriangle - thirdSide));
    }

    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide;
    }
}
