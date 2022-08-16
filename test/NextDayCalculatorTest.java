import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("test 2/1/2018")
    void test01012018(){
        int day=01;
        int month=01;
        int year=2018;
        String expected="2/1/2018";
        String result=NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
}
