package FirstDayLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleTables {
    public static void main(String[]arg){
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/write-xpath-table.html");
    String innerText=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(innerText);

    // number of rows
        List<WebElement> rows= driver.findElements(By.xpath("//table[@border='1']/tbody/tr"));
        System.out.println(rows.size());

        driver.close();

    }
}
