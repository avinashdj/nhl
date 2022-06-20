package hooks;

import com.nhl.driver.Driver;
import com.nhl.driver.DriverManager;
import io.cucumber.java.*;

public class NHLMobileHook {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("Before");
        Driver.initDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After");
        System.out.println(scenario.getStatus());
        //Driver.quitDriver();
    }

//    @Before("@Regression")
//    public void setUpForRegression(Scenario scenario){
//        System.out.println("Before Regression");
//        System.out.println(scenario.getStatus());
//    }
//
//    @After("@Regression")
//    public void tearDownForRegression(Scenario scenario){
//        System.out.println("After Regression");
//        System.out.println(scenario.getStatus());
//    }

    @BeforeStep
    public void beforeStep(){

    }

    @AfterStep
    public void afterStep(){

    }
}
