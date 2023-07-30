import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.LocalDate;
import static org.testng.Assert.assertEquals;

public class TestBoolean {
    double a = 4.0;
    double b = 2.0;


    @Test
    public void testDate() {
        LocalDate date = LocalDate.now();
        Assert.assertEquals(date.getYear(), 2023);
        Assert.assertEquals(date.getMonthValue(), 7);
        Assert.assertEquals(date.getDayOfMonth(), 30);
    }


    @Test
    public void testChekN() {
        CheckTheNumber Ch = new CheckTheNumber();
        double result = Ch.Stepen(a, b);
        assertEquals(25.0, result);


    }

}
