import ru.netology.service.CashbackHacker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();
    @Test
    public void AmountLessThan1000() {
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountMoreThan1000() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountEqualTo1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
