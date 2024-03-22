package TDDbaitap;

import static org.junit.jupiter.api.Assertions.*;

class nextDayCaculatorTest {
    public void testDay1Month1Year2018(){};
    int day = 1;
    int month = 1;
    int year = 2018;
    String expected ="2/1/2018";
    String result = nextDayCaculator.getNextDay(day, month,year);
}