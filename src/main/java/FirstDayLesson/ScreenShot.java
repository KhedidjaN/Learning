package FirstDayLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ScreenShot {

    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
       driver.get("https://wwws.airfrance.fr/splash");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        TakesScreenshot scrShot=(TakesScreenshot)driver;
        File ScrFile=scrShot.getScreenshotAs(OutputType.FILE);




    }
}
