package FirstDayLesson;
import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Day2 {
    public static void main (String[]args){
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.namecheap.com/");
      //  driver.get("https://demoqa.com/login");
      //  driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);

       WebElement userName=driver.findElement(By.id("userName"));
       WebElement passWord=driver.findElement(By.id("password"));
       WebElement logBtn=driver.findElement(By.id("login"));
       userName.sendKeys("testuser");
       passWord.sendKeys("Password@123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       logBtn.click();
        try {

        WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));

            if(logoutBtn.isDisplayed()){
                logoutBtn.click();
                System.out.println("LogOut Successful!");
            }
        }
        catch (Exception e) {
            System.out.println("Incorrect login....");
    }

}}
