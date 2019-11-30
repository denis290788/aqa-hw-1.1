import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedResult = 0;
        int actualResult = service.remain(amount);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn400IfAmount1600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;
        int expectedResult = 400;
        int actualResult = service.remain(amount);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1IfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expectedResult = 1;
        int actualResult = service.remain(amount);
        assertEquals(expectedResult, actualResult);
    }
}