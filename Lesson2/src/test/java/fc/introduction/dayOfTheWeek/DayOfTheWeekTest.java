package fc.introduction.dayOfTheWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {

    @Test
    void checkDayOfTheWeek() {

        //given
        int randomDay = 2;
        int anotherRandomDay1 = 5;
        int anotherRandomDay2 = 6;
        int anotherRandomDay3 = 7;
        int errorDay = 40;

        //when
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String firstRandomDayToCheck = dayOfTheWeek.checkDayOfTheWeek(randomDay);
        String secondRandomDayToCheck = dayOfTheWeek.checkDayOfTheWeek(anotherRandomDay1);
        String thirdRandomDayToCheck = dayOfTheWeek.checkDayOfTheWeek(anotherRandomDay2);
        String fortyRandomDayToCheck = dayOfTheWeek.checkDayOfTheWeek(anotherRandomDay3);
        String errorDayToCheck = dayOfTheWeek.checkDayOfTheWeek(errorDay);

        //then
        Assertions.assertEquals(firstRandomDayToCheck,"Tuesday");
        Assertions.assertEquals(secondRandomDayToCheck,"Friday");
        Assertions.assertEquals(thirdRandomDayToCheck,"Weekend");
        Assertions.assertEquals(fortyRandomDayToCheck,"Weekend");
        Assertions.assertEquals(errorDayToCheck,"There is no such a day!");
    }
}