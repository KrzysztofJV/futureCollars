package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateAreaWithWidthTwoAndHeightThree(){
        //given
        double width = 2;
        double height = 3;

        //when
        Rectangle rectangle = new Rectangle(height, width);
        double result = rectangle.getArea();

        //then
        Assertions.assertEquals(6,result);
    }

    @Test
    void shouldCalculateExceptionWithHeightZero(){
        //given
        double width = 6;
        double height = 0;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Rectangle(height, width));

        //then
        Assertions.assertEquals("Error: the sides of the rectangle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculateExceptionWithHeightNegative(){
        //given
        double width = 4;
        double height = -5;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Rectangle(height, width));

        //then
        Assertions.assertEquals("Error: the sides of the rectangle must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculatePerimeterWithWidthTwoAndHeightThree(){
        //given
        double width = 2;
        double height = 3;

        //when
        Rectangle rectangle = new Rectangle(height, width);
        double result = rectangle.getPerimeter();

        //then
        Assertions.assertEquals(10,result);
    }
}