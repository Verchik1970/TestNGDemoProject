
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.LocalDate;
import static org.testng.Assert.assertEquals;


public class TestBoolean {
    @DataProvider(name = "numbers")
    public Object[][] generateNumbers() {
        return new Object[][]{
                {2.0, 2.0},
                {2.0, 3.0},
                {2.0, 4.0}

        };
    }



    @Test(dataProvider = "numbers")
    public void testChekN(double a, double b) {
        CheckTheNumber Ch = new CheckTheNumber();
        double result = Ch.Stepen(a, b);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testDate() {
        LocalDate date = LocalDate.now();
        assertEquals(date.getYear(), 2023);
        assertEquals(date.getMonthValue(), 7);
        assertEquals(date.getDayOfMonth(), 30);
    }


}
