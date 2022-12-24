package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleIframe {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.elwatan.com/");
        int size=driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        driver.switchTo().frame("twitter-widget-0");
        driver.findElement(By.linkText("Suivre")).click();

    }
}
