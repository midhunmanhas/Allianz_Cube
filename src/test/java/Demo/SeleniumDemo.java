package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SeleniumDemo {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        //driver.quit();
    }
}
