package epam.com.java.unittests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Admin on 22.11.2015.
 */
public class TgAnCtgTests extends BasicTest{

    @Test(dataProvider = "dataProviderForTg")
    public void tgTest(double a, double expResult){
        double result = calculator.tg(a);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForTg")
    public Object[][] dataProviderTg(){
        return new Object[][]{
                {0, 0},
                {Math.PI/4, 1},
                {-Math.PI/4, -1},
                {Math.PI/2, 0}};
    }


    @Test(dataProvider = "dataProviderForCtg")
    public void ctgTest(double a, double expResult){
        double result = calculator.ctg(a);
        assertEquals(result, expResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForCtg")
    public Object[][] dataProviderCtg(){
        return new Object[][]{
                {Math.PI/2, 0},
                {Math.PI/4, 1},
                {-Math.PI/4, -1},
                {0, 0}};
    }

}
