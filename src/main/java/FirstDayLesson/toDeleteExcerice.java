package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class toDeleteExcerice {
    public static void main(String[]args){
        WebDriver driver=new EdgeDriver();
        driver.get("http://demo.guru99.com/test/write-xpath-table.html");
        driver.manage().window().maximize();
        List<WebElement> cols=driver.findElements(By.xpath("//table[@border='1']/thead/tr/th"));
        System.out.println(cols.size());
    }
}
