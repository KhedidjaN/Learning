package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Day5 {


    public static void main(String[]args){
        WebDriver driver= new EdgeDriver();

        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchBttn=driver.findElement(By.id("nav-search-submit-button")) ;
        searchBox.sendKeys("Dresses in wool");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBttn.click();
        String a=searchBox.getAttribute("id");
        System.out.println(a);


    }
}
