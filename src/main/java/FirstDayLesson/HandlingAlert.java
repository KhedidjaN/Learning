package FirstDayLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingAlert {
    public static void main (String []args){
        WebDriver driver=new EdgeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement customerID=driver.findElement(By.name("cusid"));
        WebElement submitBttn=driver.findElement(By.name("submit"));
        customerID.sendKeys("ahmed");
        submitBttn.click();

        Alert alert=driver.switchTo().alert();
        // confirmation alert
        alert.dismiss();



    }
}
