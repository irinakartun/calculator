package epam.com.java.unittests;

import org.testng.annotations.Factory;

/**
 * Created by Admin on 22.11.2015.
 */
public class PositiveNegativeFactoryTest {

    @Factory
    public Object[] getTest(){
        return new Object[] {
                new PositiveAndNegativeTests(0, false, false),
                new PositiveAndNegativeTests(1, true, false),
                new PositiveAndNegativeTests(-25, false, true)
        };
    }

}
