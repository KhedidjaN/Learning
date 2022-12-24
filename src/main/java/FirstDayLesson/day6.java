package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class day6 {
    public static void main(String[] args){
    WebDriver driver= new EdgeDriver();

    driver.get("https://www.amazon.com/");
         driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchBttn=driver.findElement(By.id("nav-search-submit-button")) ;
        searchBox.sendKeys("Long dress in wool");
        searchBttn.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement checkBox1= driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
        checkBox1.click();



}
}
