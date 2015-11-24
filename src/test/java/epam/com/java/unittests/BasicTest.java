package epam.com.java.unittests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

/**
 * Created by Admin on 21.11.2015.
 */
public class BasicTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

}
