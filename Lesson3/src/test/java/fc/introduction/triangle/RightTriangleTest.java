package fc.introduction.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static fc.introduction.triangle.RightTriangle.isRightTriangle;

class RightTriangleTest {

    @Test
    void shouldNotBeRightTriangleWhenFirstSideIsTooLong() {
        //given
        int firstSide = 2;
        int secondSide = 7;
        int thirdSide = 9;

        //when
        String triangleToCheck = isRightTriangle(firstSide, secondSide, thirdSide);

        //then
        Assertions.assertEquals(triangleToCheck,"Not a right Triangle");

    }

    @Test
    void shouldBeRightTriangleWhenAllSidesInFirstCombinationHaveTheCorrectLength() {
        //given
        int firstSide = 3;
        int secondSide = 5;
        int thirdSide = 4;

        //when
        String triangleToCheck = isRightTriangle(firstSide, secondSide, thirdSide);

        //then
        Assertions.assertEquals(triangleToCheck,"Right Triangle");
    }

    @Test
    void shouldBeRightTriangleWhenAllSidesInSecondCombinationHaveTheCorrectLength() {
        //given
        int firstSide = 8;
        int secondSide = 6;
        int thirdSide = 10;

        //when
        String triangleToCheck = isRightTriangle(firstSide, secondSide, thirdSide);

        //then
        Assertions.assertEquals(triangleToCheck,"Right Triangle");
    }

    @Test
    void shouldNotBeRightTriangleWhenOneSideHaveNoLength() {
        //given
        int firstSide = 0;
        int secondSide = 5;
        int thirdSide = 7;

        //when
        String triangleToCheck = isRightTriangle(firstSide, secondSide, thirdSide);

        //then
        Assertions.assertEquals(triangleToCheck,"Invalid");
    }

    @Test
    void shouldNotBeRightTriangleWhenOneSideIsNegative() {
        //given
        int firstSide = 3;
        int secondSide = 5;
        int thirdSide = -7;

        //when
        String triangleToCheck = isRightTriangle(firstSide, secondSide, thirdSide);

        //then
        Assertions.assertEquals(triangleToCheck,"Invalid");
    }
}