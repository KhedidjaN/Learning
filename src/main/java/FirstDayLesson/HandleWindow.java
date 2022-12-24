package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindow {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("http://demo.guru99.com/popup.php");
    //    String windowName=driver.getWindowHandle();
      //  System.out.println(windowName);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement clickBttn=driver.findElement(By.linkText("Click Here"));
        clickBttn.click();

        String mainWindow=driver.getWindowHandle();

        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while (i1.hasNext()){
            String childWIndow=i1.next();
            if(!mainWindow.equalsIgnoreCase(childWIndow)){
                driver.switchTo().window(childWIndow);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();

             //   driver.close();
            }
        }

    driver.switchTo().window(mainWindow);


    }
}
