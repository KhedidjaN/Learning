package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7 {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
       Select drpCountry=new Select(driver.findElement(By.name("country")));
       Boolean drpMultipleSelect=drpCountry.isMultiple();
       drpCountry.selectByVisibleText("ANGUILLA");

       if (drpMultipleSelect==true){
           System.out.println("yes");
       } else
           System.out.println("no");



    }
}
