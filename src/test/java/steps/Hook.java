package steps;

import Base.BaseUtil;


import Base.ExtentReportUtil;
import cucumber.api.PickleStepTestStep;
import cucumber.api.TestCase;
import gherkin.pickles.PickleStep;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


/**
 * Created by Karthik on 31/01/2019.
 */

public class Hook extends BaseUtil{

    ExtentReportUtil extentReportUtil = new ExtentReportUtil();
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {


       // scenarioDef = features.createNode(scenario.getName());


        System.out.println("Opening the browser : Firefox");


        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
        base.Driver = new FirefoxDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) throws IOException {
     /*   if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
            extentReportUtil.ExtentReportScreenshot("The scenario that has failed: " + scenario.getName());
        }
        Driver.quit();*/
        System.out.println("Closing the browser : MOCK");
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step " + scenario.getId());

        //((PickleStep)((PickleStepTestStep)
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        //System.out.println("Before every step " + stepTestStep.getId());
    }

}
