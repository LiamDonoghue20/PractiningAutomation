package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExtentReportUtil extends BaseUtil {
    String fileName = reportLocation + "extentreport.html";

    public void ExtentReport(){
        extent = new ExtentReports();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("First test selenium report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Shopping site report");

    }


    public void ExtentReportScreenshot(String screenShotName) throws IOException {

        //method to take a screen shot, name it screenshot.png then add it to the same location as your report
        var scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scr.toPath(), new File(reportLocation + screenShotName + ".png").toPath());
        scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation + screenShotName + ".png");
    }


    //flush to clear out the report when done
    public void FlushReport(){
        extent.flush();
    }
}
