package FirstDayLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class handleWindow2 {
    public static void main(String[]args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        //    String windowName=driver.getWindowHandle();
        //  System.out.println(windowName);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String uniqueId=driver.getWindowHandle();
        System.out.println(uniqueId);
    }
}
