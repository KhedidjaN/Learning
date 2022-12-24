package FirstDayLesson ;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.concurrent.TimeUnit;



public class HandleCalender {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.guru99.com/test/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement dateBox=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        dateBox.sendKeys("09252013");
        // Press Tab to shift focus to time field
        dateBox.sendKeys(Keys.TAB);
        dateBox.sendKeys("0245PM");

    }
}
