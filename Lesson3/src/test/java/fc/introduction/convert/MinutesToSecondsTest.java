package fc.introduction.convert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static fc.introduction.convert.MinutesToSeconds.convertMinutesToSeconds;

class MinutesToSecondsTest {

    @Test
    public void shouldConvertNoMinutesToSeconds() {
        //given
        int valueToConvert = 0;

        //when
        int convertedMinutes = convertMinutesToSeconds(valueToConvert);

        //then
        Assertions.assertEquals(0, convertedMinutes);
    }

    @Test
    public void shouldConvertMinutesToSeconds() {
        //given
        int valueToConvert = 60;

        //when
        int convertedMinutes = convertMinutesToSeconds(valueToConvert);

        //then
        Assertions.assertEquals(3600, convertedMinutes);
    }

    @Test
    public void shouldNotConvertInvalidMinutes() {

        Assertions.assertThrows(RuntimeException.class, () -> {
            convertMinutesToSeconds(-6);
        });
    }
}