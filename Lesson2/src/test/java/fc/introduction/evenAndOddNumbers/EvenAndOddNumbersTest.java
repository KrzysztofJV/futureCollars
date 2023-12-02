package fc.introduction.evenAndOddNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenAndOddNumbersTest {

    @Test
    void checkNumber() {

        //given
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = -6;

        //when
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        String firstNumberToCheck = evenAndOddNumbers.checkNumber(firstNumber);
        String secondNumberToCheck = evenAndOddNumbers.checkNumber(secondNumber);
        String thirdNumberToCheck = evenAndOddNumbers.checkNumber(thirdNumber);

        //then
        Assertions.assertEquals(firstNumberToCheck,"This is an even number.");
        Assertions.assertEquals(secondNumberToCheck,"This is an odd number.");
        Assertions.assertEquals(thirdNumberToCheck,"This is an even number.");
    }
}