package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Admin on 22.11.2015.
 */
public class PowAndSqrtTests extends BasicTest {

    @Test(dataProvider = "dataProviderForPow")
    public void powTest(double a, double b, double expResult){
        double result = calculator.pow(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForPow")
    public Object[][] dataProviderPow(){
        return new Object[][]{
                {3, 2, 9},
                {0, 5, 0},
                {5, 0, 1},
                {5.5, 3, 166.375},
                {10, -5, 0.00001},
                {10, 0.25, 0.001}};
    }


    @Test(dataProvider = "dataProviderForSqrt")
    public void sqrtTest(double a, double expResult){
        double result = calculator.sqrt(a);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForSqrt")
    public Object[][] dataProviderSqrt(){
        return new Object[][]{
                {4, 2},
                {0.25, 0.5},
                {1, 1},
                {-9, 3}};
    }


}
