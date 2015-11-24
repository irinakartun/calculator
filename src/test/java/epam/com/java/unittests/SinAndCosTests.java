package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Admin on 22.11.2015.
 */
public class SinAndCosTests extends BasicTest {

    @Test(dataProvider = "dataProviderForSin")
    public void sinTest(double a, double expResult){
        double result = calculator.sin(a);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForSin")
    public Object[][] dataProviderSin(){
        return new Object[][]{
                {0, 0},
                {Math.PI/2, 1},
                {-Math.PI/2, -1},
                {Math.PI/6, 0.5}};
    }

    @Test(dataProvider = "dataProviderForCos")
    public void osTest(double a, double expResult){
        double result = calculator.cos(a);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForCos")
    public Object[][] dataProviderCos(){
        return new Object[][]{
                {0, 1},
                {Math.PI/2, 0},
                {-Math.PI, -1},
                {Math.PI/3, 0.5}};
    }

}
