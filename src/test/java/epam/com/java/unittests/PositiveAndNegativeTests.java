package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Admin on 22.11.2015.
 */
public class PositiveAndNegativeTests extends BasicTest {

    private long value;
    private boolean expPositive;
    private boolean expNegative;


    public PositiveAndNegativeTests(long value, boolean expPositive, boolean expNegative) {
        this.value = value;
        this.expPositive = expPositive;
        this.expNegative = expNegative;
    }

    @Test
    public void isPositiveTest(){
        assertTrue(calculator.isPositive(value) == expPositive);
    }

    @Test
    public void isNegattiveTest(){
        assertTrue(calculator.isNegative(value) == expNegative);
    }


}
