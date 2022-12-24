package FirstDayLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class AirFranceClass {
    public static void  main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://wwws.airfrance.fr/splash");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.id("accept_cookies_btn")).click();



    }
}
