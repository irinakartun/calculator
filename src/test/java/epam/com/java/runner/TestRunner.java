package epam.com.java.runner;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 22.11.2015.
 */
public class TestRunner {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
        tng.addListener(tla);
        tng.addListener(new TestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
                add("D:\\Eclipse\\workspace\\unit-tests\\src\\test\\resources\\calculator.xml");
        }});
        suite.setSuiteFiles(files);
        suite.setParallel(XmlSuite.ParallelMode.METHODS);
        suite.setThreadCount(5);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }

 }
