package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Admin on 22.11.2015.
 */
public class MultAndDivTests extends BasicTest {

    @Test(dataProvider = "dataProviderForLongMult")
    public void multLongTest(long a, long b, long expResult){
        long result = calculator.mult(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongMult")
    public Object[][] dataProviderMultLong(){
        return new Object[][]{
                {3, 2, 6},
                {2, -30, -60},
                {0, 18, 0},
                {Long.MAX_VALUE, 2, (2 * Long.MAX_VALUE)},
                {Long.MIN_VALUE, 3, (3 * Long.MIN_VALUE)}};
    }

    @Test(dataProvider = "dataProviderForDoubleMult")
    public void multDoubleTest(double a, double b, double expResult){
        double result = calculator.mult(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleMult")
    public Object[][] dataProviderMultDouble(){
        return new Object[][]{
                {0.5, 2.5, 1.25},
                {-10.25, 1.5, -15.375},
                {0, 1.7, 0},
                {1, 2, 2},
                {Double.MAX_VALUE, 2, (2 * Double.MAX_VALUE)},
                {Double.MIN_VALUE, 3, (3 * Double.MIN_VALUE)}};
    }


    @Test(expectedExceptions = {NumberFormatException.class})
    public void divLongByZeroTest(){
        long result = calculator.div(9, 0);
    }

    @Test(dataProvider = "dataProviderForLongDiv")
    public void divLongTest(long a, long b, long expResult){
        long result = calculator.div(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongDiv")
    public Object[][] dataProviderDivLong(){
        return new Object[][]{
                {30, 2, 15},
                {6, -3, -2},
                {0, 18, 0},
                {10, 4, 2.5}};
    }

    @Test(dataProvider = "dataProviderForDoubleDiv")
    public void divDoubleTest(double a, double b, double expResult){
        double result = calculator.div(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleDiv")
    public Object[][] dataProviderDivDouble(){
        return new Object[][]{
                {3.5, 2, 1.75},
                {50, -40, -1.25},
                {0, 1.5, 0},
                {6, 0, 0},
                {8.5, 4.25, 2}};
    }





}
