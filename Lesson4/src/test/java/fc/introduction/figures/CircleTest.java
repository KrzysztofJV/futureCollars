package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateAreaWithRadiusTwo(){
        //given
        double radius = 2;

        //when
        Circle circle = new Circle(radius);
        double result = circle.getArea();

        //then
        Assertions.assertEquals(12.56,result);
    }

    @Test
    void shouldCalculateExceptionWithRadiusZero(){
        //given
        double radius = 0;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Circle(radius));

        //then
        Assertions.assertEquals("Error: the radius of the circle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculateExceptionWithRadiusNegative(){
        //given
        double radius = -5;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Circle(radius));

        //then
        Assertions.assertEquals("Error: the radius of the circle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculatePerimeterWithRadiusThree(){
        //given
        double radius = 3;

        //when
        Circle circle = new Circle(radius);
        double result = circle.getPerimeter();

        //then
        Assertions.assertEquals(18.84,result);
    }
}