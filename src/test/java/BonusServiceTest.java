import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 10;
        long actual = service.calculate(1_000, false);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(55_000, false);

        Assertions.assertEquals(expected, actual);

    }
}
