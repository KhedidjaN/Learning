package FirstDayLesson;


import org.junit.Assert;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ds {

    public static void  main   (String[]args){
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SARA\\Desktop\\Learning\\WebChromeDriver.exe");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
      WebElement searchBox=driver.findElement(By.name("q"));
      WebElement googleSearchBtn=driver.findElement(By.name("btnK"));
      searchBox.sendKeys("How to breathe");
      googleSearchBtn.click();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.navigate().back();





    }

}
