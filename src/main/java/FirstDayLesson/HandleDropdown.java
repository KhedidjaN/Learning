package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandleDropdown {
    public static void  main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Select select=new Select(driver.findElement(By.name("country")));
        Boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);
        select.selectByIndex(1);
        int  size= select.getOptions().size();
        System.out.println(size);

    }
}
