package FirstDayLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.junit.Assert ;

public class Day4 {

    public static void main (String[]args){
        WebDriver driver= new ChromeDriver();


          driver.get("https://demoqa.com/login");
         driver.manage().window().maximize();
         String p=driver.getPageSource();
      /*  String title= driver.getTitle();
       Assert.assertEquals("Buy a domain name - Register cheap domain names from $0.99 - Namecheap",title);

     */
        if (p.equals("Search for your domain name") ){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        driver.close();
    }
}
