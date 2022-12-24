package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HandleCheckboxesAndRadioBttn {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement radioBttn=driver.findElement(By.id("impressiveRadio"));
        Boolean isSelected=radioBttn.isSelected();
        System.out.println(isSelected);
     radioBttn.click();

    }
}
