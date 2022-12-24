package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingFrames {
    public static void main(String[]args){
    WebDriver driver = new EdgeDriver();
    driver.get("https://demo.guru99.com/test/guru99home/");
    //total number of iframes
    int size=driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //switch to frame by ID
      driver.switchTo().frame("a077aa5e");
      driver.switchTo().parentFrame();


    }
}