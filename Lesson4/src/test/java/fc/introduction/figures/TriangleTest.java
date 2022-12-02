package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateAreaWithSidesThreeFourAndFive() {
        //given
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = 5;

        //when
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        double result = triangle.getArea();

        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    void shouldCalculateExceptionWithSideZero() {
        //given
        double firstSide = 3;
        double secondSide = 0;
        double thirdSide = 5;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Triangle(firstSide,secondSide,thirdSide));

        //then
        Assertions.assertEquals("Error: the sides of the triangle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculateExceptionWithSideNegative() {
        //given
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = -5;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Triangle(firstSide,secondSide,thirdSide));

        //then
        Assertions.assertEquals("Error: the sides of the triangle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculatePerimeterWithSidesThreeFourAndFive() {
        //given
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = 5;

        //when
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        double result = triangle.getPerimeter();

        //then
        Assertions.assertEquals(12, result);
    }

}