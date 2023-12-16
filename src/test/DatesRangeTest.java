import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DatesRangeTest {

    @Test
    void getDatesRange() {
        Assertions.assertEquals(DatesRange.getDatesRange(LocalDate.parse("2023-11-12"),LocalDate.parse("2023-11-11")).length,0);
        Assertions.assertEquals(DatesRange.getDatesRange(LocalDate.parse("2023-02-28"),LocalDate.parse("2023-02-28")).length,1);
        Assertions.assertEquals(DatesRange.getDatesRange(LocalDate.parse("2020-05-28"),LocalDate.parse("2020-06-02")).length,6);
        Assertions.assertEquals(DatesRange.getDatesRange(LocalDate.parse("1901-01-01"),LocalDate.parse("1901-12-31")).length,365);
    }
}