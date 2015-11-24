package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Admin on 21.11.2015.
 */
public class SumAndSubTests extends BasicTest {

    @Test(dataProvider = "dataProviderForLongSum", priority = 0)
    public void sumLongTest(long a, long b, long expResult){
        long result = calculator.sum(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongSum")
    public Object[][] dataProviderSumLong(){
        return new Object[][]{
                {3, 2, 5},
                {25, -30, -5},
                {0, 18, 18},
                {Long.MAX_VALUE, 1, (Long.MAX_VALUE + 1)},
                {Long.MIN_VALUE, -1, (Long.MIN_VALUE - 1)}};
    }

    @Test(dataProvider = "dataProviderForDoubleSum", priority = 1)
    public void sumDoubleTest(double a, double b, double expResult){
        double result = calculator.sum(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleSum")
    public Object[][] dataProviderSumDouble(){
        return new Object[][]{
                {0.5, 2.5, 3},
                {-10.25, 1.5, -8.75},
                {0, 1.7, 1.7},
                {1, 2, 3},
                {Double.MAX_VALUE, 1, Double.MAX_VALUE + 1},
                {Double.MIN_VALUE, -1, Double.MIN_VALUE - 1}};
    }

    @Test(dataProvider = "dataProviderForLongSub", priority = 2)
    public void subDoubleTest(long a, long b, long expResult){
        long result = calculator.sub(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongSub")
    public Object[][] dataProviderSubLong(){
        return new Object[][]{
                {5, 3, 2},
                {-8, -10, 2},
                {-15, -10, -5}};
    }

    @Test(dataProvider = "dataProviderForDoubleSub", priority = 3)
    public void subDoubleTest(double a, double b, double expResult){
        double result = calculator.sub(a, b);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleSub")
    public Object[][] dataProviderSubDouble(){
        return new Object[][]{
                {5.5, 1.3, 4.2},
                {-10.05, 1.5, -11.55},
                {-2.3, -6.7, 4.4},
                {5, 8, -3}};
    }

}
